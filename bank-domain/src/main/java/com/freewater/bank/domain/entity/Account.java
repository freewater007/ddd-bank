package com.freewater.bank.domain.entity;

import com.freewater.bank.ddd.Entity;
import com.freewater.bank.exception.DailyLimitExceededException;
import com.freewater.bank.exception.InsufficientFundsException;
import com.freewater.bank.exception.InvalidCurrencyException;
import com.freewater.bank.types.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
@Getter
@AllArgsConstructor
public class Account implements Entity {
    private AccountId id;
    private AccountNumber accountNumber;
    private UserId userId;
    private Money available;
    private Money dailyLimit;

    public Currency getCurrency() {
        return this.available.getCurrency();
    }

    // 转入
    public void deposit(Money money) {
        if (!this.getCurrency().equals(money.getCurrency())) {
            throw new InvalidCurrencyException();
        }
        this.available = this.available.add(money);
    }

    // 转出
    public void withdraw(Money money) {
        if (this.available.compareTo(money) < 0) {
            throw new InsufficientFundsException();
        }
        if (this.dailyLimit.compareTo(money) < 0) {
            throw new DailyLimitExceededException();
        }
        this.available = this.available.subtract(money);
    }
}

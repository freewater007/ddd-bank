package com.freewater.bank.domain.types;

import com.freewater.bank.domain.entity.Account;
import com.freewater.bank.types.AccountNumber;
import com.freewater.bank.types.Money;
import com.freewater.bank.types.UserId;

import java.util.Date;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
public class AuditMessage {
    private UserId userId;
    private AccountNumber source;
    private AccountNumber target;
    private Money money;
    private Date date;

    public AuditMessage(UserId userId, Account sourceAccount, Account targetAccount, Money targetMoney) {
        this.userId = userId;
        this.source = sourceAccount.getAccountNumber();
        this.target = targetAccount.getAccountNumber();
        this.money = targetMoney;
        this.date = new Date();
    }

    public String serialize() {
        return userId + "," + source + "," + target + "," + money + "," + date;
    }

    public static AuditMessage deserialize(String value) {
        // todo
        return null;
    }
}

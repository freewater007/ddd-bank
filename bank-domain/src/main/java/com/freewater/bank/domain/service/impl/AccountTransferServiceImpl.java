package com.freewater.bank.domain.service.impl;

import com.freewater.bank.domain.entity.Account;
import com.freewater.bank.domain.service.AccountTransferService;
import com.freewater.bank.external.ExchangeRateService;
import com.freewater.bank.types.ExchangeRate;
import com.freewater.bank.types.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
@Component
public class AccountTransferServiceImpl implements AccountTransferService {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @Override
    public void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate) {
        Money sourceMoney = exchangeRate.exchangeTo(targetMoney);
        sourceAccount.deposit(sourceMoney);
        targetAccount.withdraw(targetMoney);

    }
}

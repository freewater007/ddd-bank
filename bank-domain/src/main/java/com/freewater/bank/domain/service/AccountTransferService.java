package com.freewater.bank.domain.service;

import com.freewater.bank.ddd.DomainService;
import com.freewater.bank.domain.entity.Account;
import com.freewater.bank.types.ExchangeRate;
import com.freewater.bank.types.Money;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
public interface AccountTransferService extends DomainService {
    void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate);
}

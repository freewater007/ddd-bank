package com.freewater.bank.repository;


import com.freewater.bank.ddd.Repository;
import com.freewater.bank.domain.entity.Account;
import com.freewater.bank.types.AccountId;
import com.freewater.bank.types.AccountNumber;
import com.freewater.bank.types.UserId;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
public interface AccountRepository extends Repository {
    Account find(AccountId id);
    Account find(AccountNumber accountNumber);
    Account find(UserId userId);
    Account save(Account account);
}

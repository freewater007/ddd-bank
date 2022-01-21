package com.freewater.bank.application;



import com.freewater.bank.ddd.ApplicationService;

import java.math.BigDecimal;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
public interface TransferService extends ApplicationService {
    boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) ;
}

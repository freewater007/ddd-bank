package com.freewater.bank.external.service;

import com.freewater.bank.types.Currency;

import java.math.BigDecimal;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
public interface YahooForExService {
    BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency);
}

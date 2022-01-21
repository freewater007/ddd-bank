package com.freewater.bank.external.service.impl;

import com.freewater.bank.external.service.YahooForExService;
import com.freewater.bank.types.Currency;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
@Component
public class YahooForExServiceImpl implements YahooForExService {

    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) {
        return BigDecimal.ONE;
    }
}

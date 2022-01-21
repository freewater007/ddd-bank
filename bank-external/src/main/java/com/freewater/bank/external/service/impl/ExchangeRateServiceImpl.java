package com.freewater.bank.external.service.impl;

import com.freewater.bank.external.ExchangeRateService;
import com.freewater.bank.external.service.YahooForExService;
import com.freewater.bank.types.ExchangeRate;
import com.freewater.bank.types.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
@Component
public class ExchangeRateServiceImpl implements ExchangeRateService {
    @Autowired
    private YahooForExService yahooForexService;

    @Override
    public ExchangeRate getExchangeRate(Currency source, Currency target) {
        if (source.equals(target)) {
            return new ExchangeRate(BigDecimal.ONE, source, target);
        }
        BigDecimal foreignExchange = yahooForexService.getExchangeRate(source, target);
        return new ExchangeRate(foreignExchange, source, target);
    }
}

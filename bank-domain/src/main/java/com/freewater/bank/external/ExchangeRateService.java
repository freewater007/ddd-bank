package com.freewater.bank.external;

import com.freewater.bank.types.Currency;
import com.freewater.bank.types.ExchangeRate;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
public interface ExchangeRateService {
    ExchangeRate getExchangeRate(Currency source, Currency target);
}

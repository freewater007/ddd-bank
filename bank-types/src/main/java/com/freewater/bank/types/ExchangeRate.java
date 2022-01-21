package com.freewater.bank.types;


import com.freewater.bank.ddd.ValueObject;
import com.freewater.bank.exception.InvalidCurrencyException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
@Getter
@EqualsAndHashCode
@ToString
public class ExchangeRate implements ValueObject {
    private final BigDecimal foreignExchange;
    private final Currency source;
    private final Currency target;

    public ExchangeRate(BigDecimal foreignExchange, Currency source, Currency target) {
        this.foreignExchange = foreignExchange;
        this.source = source;
        this.target = target;
    }


    public Money exchangeTo(Money sourceMoney) {
        if (sourceMoney == null) {
            throw new NullPointerException();
        }
        if (!source.equals(sourceMoney.getCurrency())) {
            throw new InvalidCurrencyException();
        }
        BigDecimal sourceAmount = sourceMoney.getValue().divide(foreignExchange, RoundingMode.DOWN);
        return new Money(sourceAmount, target);
    }
}

package com.freewater.bank.types;

import com.freewater.bank.ddd.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
@Getter
@EqualsAndHashCode
@ToString
public class AccountId implements ValueObject {
    private final Long value;

    public AccountId(Long value) {
        this.value = value;
    }


}

package com.freewater.bank.types;

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
public class UserId {
    private final Long id;

    public UserId(Long id) {
        this.id = id;
    }
}

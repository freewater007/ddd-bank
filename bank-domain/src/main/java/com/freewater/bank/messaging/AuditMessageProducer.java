package com.freewater.bank.messaging;


import com.freewater.bank.domain.types.AuditMessage;

/**
 * @author : freewater
 * @date : 2020/3/25
 */
public interface AuditMessageProducer {
    boolean send(AuditMessage message);
}

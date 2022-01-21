package com.freewater.bank.messaging.impl;


import com.freewater.bank.domain.types.AuditMessage;
import com.freewater.bank.messaging.AuditMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : freewater
 * @date : 2020/3/26
 */
@Component
public class AuditMessageProducerImpl implements AuditMessageProducer {
    private static final String TOPIC_AUDIT_LOG = "TOPIC_AUDIT_LOG";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public boolean send(AuditMessage message) {
        String messageBody = message.serialize();
        kafkaTemplate.send(TOPIC_AUDIT_LOG, messageBody);
        return true;
    }
}

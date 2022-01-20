package com.innowise.audit.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.innowise.audit.model.entity.AuditUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class AuditConsumerService {

    private final BasicAuditService basicAuditService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "${kafka.properties.topic}")
    public void listen(@Payload String message) throws JsonProcessingException {
        basicAuditService.saveAudit(objectMapper.readValue(message, AuditUser.class))
                .subscribe();
    }
}

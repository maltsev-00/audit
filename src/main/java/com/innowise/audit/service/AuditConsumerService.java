package com.innowise.audit.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.innowise.audit.exception.JsonParserException;
import com.innowise.audit.model.entity.AuditUser;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuditConsumerService {

    private final BasicAuditService basicAuditService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "${kafka.properties.topic}")
    public void listen(@Payload String message) {
        try {
            basicAuditService.saveAudit(objectMapper.readValue(message, AuditUser.class))
                    .subscribe();
        } catch (JsonProcessingException e) {
            throw new JsonParserException(e.getMessage());
        }
    }
}

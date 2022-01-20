package com.innowise.audit.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("kafka.properties")
@Data
public class KafkaConsumerProperties {
    private String topic;
}

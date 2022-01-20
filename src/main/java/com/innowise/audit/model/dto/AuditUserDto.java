package com.innowise.audit.model.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Builder
public class AuditUserDto {
    String action;
    LocalDateTime date;
    String response;
}

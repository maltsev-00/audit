package com.innowise.audit.model.dto;

import lombok.Builder;
import lombok.Value;

import java.sql.Timestamp;

@Value
@Builder
public class AuditUserDto {
    String action;
    Timestamp date;
    String response;
}

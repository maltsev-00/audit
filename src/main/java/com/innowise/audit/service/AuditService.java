package com.innowise.audit.service;

import com.innowise.audit.model.dto.AuditUserDto;
import reactor.core.publisher.Flux;

public interface AuditService {

    Flux<AuditUserDto> getAudits();
}

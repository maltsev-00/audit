package com.innowise.audit.service;

import com.innowise.audit.model.entity.AuditUser;
import reactor.core.publisher.Mono;

public interface BasicAuditService {

    Mono<AuditUser> saveAudit(AuditUser auditUser);
}

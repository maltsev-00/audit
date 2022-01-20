package com.innowise.audit.service;

import com.innowise.audit.converter.AuditConverter;
import com.innowise.audit.model.dto.AuditUserDto;
import com.innowise.audit.model.entity.AuditUser;
import com.innowise.audit.repository.AuditUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuditServiceImpl implements AuditService, BasicAuditService {

    private final AuditUserRepository auditUserRepository;
    private final AuditConverter auditConverter;

    @Override
    public Mono<AuditUser> saveAudit(AuditUser auditUser) {
        return auditUserRepository.save(auditUser);
    }

    @Override
    public Flux<AuditUserDto> getAudits() {
        return auditUserRepository.findAll()
                .map(auditConverter::convertEntityToDto);
    }

}

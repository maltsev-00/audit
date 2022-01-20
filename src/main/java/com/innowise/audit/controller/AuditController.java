package com.innowise.audit.controller;

import com.innowise.audit.model.dto.AuditUserDto;
import com.innowise.audit.service.AuditService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("audit")
@RequiredArgsConstructor
@Slf4j
public class AuditController {

    private final AuditService auditService;

    @GetMapping
    public Flux<AuditUserDto> getAudits() {
        return auditService.getAudits()
                .doOnComplete(() -> log.debug("getAudits success"))
                .doOnError(error -> log.error("getAudits error"));
    }

}

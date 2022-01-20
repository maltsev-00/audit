package com.innowise.audit.repository;

import com.innowise.audit.model.entity.AuditUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuditUserRepository extends ReactiveCrudRepository<AuditUser, UUID> {
}

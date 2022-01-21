package com.innowise.audit.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("audit_user")
public class AuditUser implements Persistable<Integer> {

    @Id
    private Integer id;
    private String action;
    private String body;
    private LocalDateTime localDateTime;

    @Transient
    private boolean newAudit;

    @Override
    public boolean isNew() {
        return this.newAudit || id == null;
    }
}

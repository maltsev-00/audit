package com.innowise.audit.converter;

import com.innowise.audit.model.dto.AuditUserDto;
import com.innowise.audit.model.entity.AuditUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuditConverter {

    AuditUserDto convertEntityToDto(AuditUser auditUser);
}

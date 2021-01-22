package com.ua.knuca.committee.mapper;

import com.ua.knuca.committee.dto.StatementDTO.StatementDTO;
import com.ua.knuca.committee.entity.StatementEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatementMapper {
    StatementDTO toStatementDTO(StatementEntity statementEntity);
}

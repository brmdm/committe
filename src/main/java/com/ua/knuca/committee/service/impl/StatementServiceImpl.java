package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.StatementDTO.StatementDTO;
import com.ua.knuca.committee.mapper.StatementMapper;
import com.ua.knuca.committee.repository.StatementRepository;
import com.ua.knuca.committee.service.StatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatementServiceImpl implements StatementService {
    private final StatementRepository statementRepository;
    private final StatementMapper statementMapper;


    @Override
    public Page<StatementDTO> findAll(Pageable pageable) {
        return statementRepository.findAll(pageable).map(statementMapper::toStatementDTO);
    }
}

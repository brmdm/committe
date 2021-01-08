package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.repository.StatementRepository;
import com.ua.knuca.committee.service.StatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatementServiceImpl implements StatementService {
    private final StatementRepository statementRepository;
}

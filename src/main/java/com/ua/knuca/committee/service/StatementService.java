package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.StatementDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StatementService {
    Page<StatementDTO> findAll(Pageable pageable);
}

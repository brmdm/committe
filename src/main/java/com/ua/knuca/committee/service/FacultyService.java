package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.FacultyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacultyService {
    Page<FacultyDTO> findAll(Pageable pageable);
}

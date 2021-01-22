package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.SubjectDTO.SubjectDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SubjectService {
    Page<SubjectDTO> findAll(Pageable pageable);
}

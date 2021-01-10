package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.FacultyDTO;
import com.ua.knuca.committee.entity.FacultyEntity;
import com.ua.knuca.committee.mapper.FacultyMapper;
import com.ua.knuca.committee.repository.FacultyRepository;
import com.ua.knuca.committee.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {
    private final FacultyRepository facultyRepository;
    private final FacultyMapper facultyMapper;

    @Override
    public Page<FacultyDTO> findAll(Pageable pageable) {
//        Page<FacultyEntity> entities = facultyRepository.findAll(pageable);
//        Page<FacultyDTO> dtos = entities.map(facultyMapper::toFacultyDTO);
//        return dtos;
        return facultyRepository.findAll(pageable).map(facultyMapper::toFacultyDTO);
    }
}

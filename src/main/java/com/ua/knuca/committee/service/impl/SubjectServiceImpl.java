package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.StatementDTO;
import com.ua.knuca.committee.dto.SubjectDTO;
import com.ua.knuca.committee.entity.StatementEntity;
import com.ua.knuca.committee.entity.SubjectEntity;
import com.ua.knuca.committee.mapper.SubjectMapper;
import com.ua.knuca.committee.repository.SubjectRepository;
import com.ua.knuca.committee.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;


    @Override
    public Page<SubjectDTO> findAll(Pageable pageable) {
//        Page<SubjectEntity> entities = subjectRepository.findAll(pageable);
//        Page<SubjectDTO> dtos = entities.map(subjectMapper::toSubjectDTO);
//        return dtos;

        return subjectRepository.findAll(pageable).map(subjectMapper::toSubjectDTO);
    }
}

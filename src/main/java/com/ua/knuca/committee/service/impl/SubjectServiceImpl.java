package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.repository.SubjectRepository;
import com.ua.knuca.committee.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
}

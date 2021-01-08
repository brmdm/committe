package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.repository.FacultyRepository;
import com.ua.knuca.committee.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {
    private final FacultyRepository facultyRepository;
}

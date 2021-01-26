package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.FacultyDTO.FacultyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacultyService {
    Page<FacultyDTO> findAll(Pageable pageable);

    FacultyDTO findFacultyById(Integer id);

    void deleteFacultyById(Integer Id);

    FacultyDTO saveNewFaculty(FacultyDTO facultyDTO);
}

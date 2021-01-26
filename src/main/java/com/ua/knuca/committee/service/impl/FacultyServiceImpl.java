package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.FacultyDTO.FacultyDTO;
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
        return facultyRepository.findAll(pageable).map(facultyMapper::toFacultyDTO);
    }

    @Override
    public FacultyDTO findFacultyById(Integer id) {
        return facultyMapper.toFacultyDTO(
                facultyRepository.findById(id).orElseThrow());
    }

    @Override
    public void deleteFacultyById(Integer id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public FacultyDTO saveNewFaculty(FacultyDTO facultyDTO) {
        FacultyEntity facultyEntity = facultyMapper.toFacultyEntity(facultyDTO);
        return facultyMapper.toFacultyDTO(facultyRepository.save(facultyEntity));
    }
}

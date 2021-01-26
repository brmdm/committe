package com.ua.knuca.committee.mapper;

import com.ua.knuca.committee.dto.FacultyDTO.FacultyDTO;
import com.ua.knuca.committee.entity.FacultyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacultyMapper {

    FacultyDTO toFacultyDTO(FacultyEntity facultyEntity);

    FacultyEntity toFacultyEntity(FacultyDTO facultyDTO);
}

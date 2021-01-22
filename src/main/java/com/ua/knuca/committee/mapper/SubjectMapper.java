package com.ua.knuca.committee.mapper;

import com.ua.knuca.committee.dto.SubjectDTO.SubjectDTO;
import com.ua.knuca.committee.entity.SubjectEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectDTO toSubjectDTO(SubjectEntity subjectEntity);
}

package com.ua.knuca.committee.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Builder
public class FacultyDTO {

    private Integer id;

    @NotNull
    private String title;

    @NotNull
    private Integer allPlaces;

    private Integer budgetPlaces;

    private Set<StatementDTO> statements;

    @NotNull
    @Size(min = 1, max = 3)
    private Set<SubjectDTO> subjects;
}

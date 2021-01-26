package com.ua.knuca.committee.dto.FacultyDTO;

import com.ua.knuca.committee.dto.SubjectDTO.SubjectDTO;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDTO {

    private Integer id;

    @NotNull
    private String title;

    @NotNull
    private Integer allPlaces;

    private Integer budgetPlaces;

    private Set<SubjectDTO> subjects;
}

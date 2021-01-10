package com.ua.knuca.committee.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatementDTO {

    private Integer id;
    private Boolean finalized;

    @NotNull
    private FacultyDTO faculty;

    private Set<UserDTO> applicants;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Timestamp createdAt;
}

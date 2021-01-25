package com.ua.knuca.committee.dto.StatementDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ua.knuca.committee.dto.FacultyDTO.FacultyDTO;
import com.ua.knuca.committee.dto.UserDTO.UserDTO;
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

    private Integer year;

    @NotNull
    private FacultyDTO faculty;

    private Set<UserDTO> applicants;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Timestamp createdAt;
}

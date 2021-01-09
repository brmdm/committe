package com.ua.knuca.committee.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ua.knuca.committee.entity.Role;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Builder
public class UserDTO {

    private Integer id;
    private String surname;
    private String name;
    private String fathersName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String city;
    private String region;
    private Boolean enable;
    private Set<Role> roles;
    private Set<StatementDTO> statement;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Set<SubjectDTO> subjects;
    private Timestamp createdAt;
}

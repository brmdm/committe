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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Timestamp createdAt;
}

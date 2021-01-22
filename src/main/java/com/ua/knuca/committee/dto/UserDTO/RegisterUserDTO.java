package com.ua.knuca.committee.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDTO {
    @NotBlank
    private String surname;
    @NotBlank
    private String name;
    @NotBlank
    private String fathersName;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String city;
    @NotBlank
    private String region;
}

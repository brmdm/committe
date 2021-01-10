package com.ua.knuca.committee.dto;

import lombok.*;

import javax.validation.constraints.NotNull;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {

    private Integer id;
    @NotNull
    private String title;
    @NotNull
    private Integer mark;
}

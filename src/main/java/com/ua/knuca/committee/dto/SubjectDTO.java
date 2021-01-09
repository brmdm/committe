package com.ua.knuca.committee.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
@Builder
public class SubjectDTO {

    private Integer id;
    @NotNull
    private String title;
    @NotNull
    private Integer mark;
}

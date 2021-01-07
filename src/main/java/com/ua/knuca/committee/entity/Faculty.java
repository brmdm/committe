package com.ua.knuca.committee.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "faculty_entity")
@Table(name = "faculties")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String title;

    @Column(name = "all_places")
    private Integer allPlaces;

    @Column(name = "budget_places")
    private Integer budgetPlaces;

    @OneToMany
    private Set<User> applicants;

    @OneToMany
    private Set<Statement> statements;
}

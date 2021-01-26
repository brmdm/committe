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
public class FacultyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")
    private Integer id;

    @Column(unique = true)
    private String title;

    @Column(name = "all_places")
    private Integer allPlaces;

    @Column(name = "budget_places")
    private Integer budgetPlaces;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<StatementEntity> statements;

    @ManyToMany
    @JoinTable(
            name = "faculty_subject",
            joinColumns = {@JoinColumn(name = "faculty_id")},
            inverseJoinColumns = {@JoinColumn(name = "subject_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<SubjectEntity> subjects;
}

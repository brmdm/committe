package com.ua.knuca.committee.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "statement_entity")
@Table(name = "statements")
public class StatementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "statement_id")
    private Integer id;

    @ColumnDefault("false")
    private Boolean finalized;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private FacultyEntity faculty;

    @ManyToMany
    @JoinTable(
            name = "faculty_user_subjects",
            joinColumns = {@JoinColumn(name = "subject_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<UserEntity> applicants;

    @CreationTimestamp
    private Timestamp createdAt;
}

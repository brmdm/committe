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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statement_id")
    private Integer id;

    private Integer year;

    @ColumnDefault("false")
    private Boolean finalized;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private FacultyEntity faculty_id;

    @ManyToMany
    @JoinTable(
            name = "users_statements",
            joinColumns = {@JoinColumn(name = "statement_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<UserEntity> applicants;

    @CreationTimestamp
    private Timestamp createdAt;
}

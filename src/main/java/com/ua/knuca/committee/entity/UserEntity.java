package com.ua.knuca.committee.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_entity")
@Table(name = "users")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;

    private String surname;

    private String name;

    @Column(name = "fathersname")
    private String fathersName;

    private String email;

    private String password;

    private String city;

    private String region;

    @ColumnDefault("true")
    private Boolean enable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "roles_users",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<RoleEntity> roles;

    @ManyToMany
    @JoinTable(
            name = "users_statements",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "statement_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<StatementEntity> statement;

    @ManyToMany
    @JoinTable(
            name = "faculty_user_subject",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "subject_id")}
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<SubjectEntity> subjects;

    @CreationTimestamp
    private Timestamp createdAt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return enable;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enable;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return enable;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }
}

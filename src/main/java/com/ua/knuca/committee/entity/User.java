package com.ua.knuca.committee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_entity")
@Table(name = "users")
public class User {
//    implements UserDetails

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}

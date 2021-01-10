package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Page<UserDTO> findAll(Pageable pageable);
}

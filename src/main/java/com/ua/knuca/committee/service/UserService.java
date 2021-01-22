package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.UserDTO.RegisterUserDTO;
import com.ua.knuca.committee.dto.UserDTO.UserDTO;
import com.ua.knuca.committee.exception.EmailAlreadyExistException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Page<UserDTO> findAll(Pageable pageable);

    UserDTO registerNewUser(RegisterUserDTO newUser) throws EmailAlreadyExistException;

    UserDTO findUserByEmail(String email);

    boolean isUserExistByEmail(String email);
}

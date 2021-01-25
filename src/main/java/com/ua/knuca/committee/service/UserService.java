package com.ua.knuca.committee.service;

import com.ua.knuca.committee.dto.StatementDTO.StatementDTO;
import com.ua.knuca.committee.dto.UserDTO.RegisterUserDTO;
import com.ua.knuca.committee.dto.UserDTO.UserDTO;
import com.ua.knuca.committee.exception.EmailAlreadyExistException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    Page<UserDTO> findAll(Pageable pageable);

    List<UserDTO> findAll();

    UserDTO registerNewUser(RegisterUserDTO newUser) throws EmailAlreadyExistException;

    UserDTO findUserByEmail(String email);

    boolean isUserExistByEmail(String email);

    List<StatementDTO> findAllStatementsByUserId(Integer userId);

    void setEnableForUserById(Integer userId, boolean enable);
}

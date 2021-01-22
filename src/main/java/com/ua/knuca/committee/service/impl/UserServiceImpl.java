package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.UserDTO.RegisterUserDTO;
import com.ua.knuca.committee.dto.UserDTO.UserDTO;
import com.ua.knuca.committee.entity.Role;
import com.ua.knuca.committee.exception.EmailAlreadyExistException;
import com.ua.knuca.committee.mapper.UserMapper;
import com.ua.knuca.committee.repository.UserRepository;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow();
    }

    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toUserDTO);
    }

    @Override
    public UserDTO findUserByEmail(String email) {
        return userMapper.toUserDTO(userRepository.findByEmail(email).orElseThrow());
    }

    @Override
    @Transactional
    public UserDTO registerNewUser(RegisterUserDTO newUser) throws EmailAlreadyExistException {
        if (isUserExistByEmail(newUser.getEmail())) {
            throw new EmailAlreadyExistException(newUser.getEmail());
        }
        newUser.setRole(Set.of(Role.USER));
        return userMapper.toUserDTO(userRepository.save(userMapper.toUserEntity(newUser)));
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}

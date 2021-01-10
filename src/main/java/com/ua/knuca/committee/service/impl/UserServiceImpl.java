package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.SubjectDTO;
import com.ua.knuca.committee.dto.UserDTO;
import com.ua.knuca.committee.entity.SubjectEntity;
import com.ua.knuca.committee.entity.UserEntity;
import com.ua.knuca.committee.mapper.UserMapper;
import com.ua.knuca.committee.repository.UserRepository;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
//        Page<UserEntity> entities = userRepository.findAll(pageable);
//        Page<UserDTO> dtos = entities.map(userMapper::toUserDTO);
//        return dtos;
        return userRepository.findAll(pageable).map(userMapper::toUserDTO);
    }
}

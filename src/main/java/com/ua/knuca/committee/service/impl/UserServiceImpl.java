package com.ua.knuca.committee.service.impl;

import com.ua.knuca.committee.dto.StatementDTO.StatementDTO;
import com.ua.knuca.committee.dto.UserDTO.RegisterUserDTO;
import com.ua.knuca.committee.dto.UserDTO.UserDTO;
import com.ua.knuca.committee.entity.Role;
import com.ua.knuca.committee.entity.UserEntity;
import com.ua.knuca.committee.exception.EmailAlreadyExistException;
import com.ua.knuca.committee.mapper.StatementMapper;
import com.ua.knuca.committee.mapper.UserMapper;
import com.ua.knuca.committee.repository.UserRepository;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final StatementMapper statementMapper;
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow();
    }

    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toUserDTO);
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(userMapper::toUserDTO).collect(Collectors.toList());
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
        newUser.setEnable(true);
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        return userMapper.toUserDTO(userRepository.save(userMapper.toUserEntity(newUser)));
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    @Autowired
    public void setPasswordEncoder(@Lazy PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<StatementDTO> findAllStatementsByUserId(Integer userId) {
        UserEntity userFromDB = userRepository.findById(userId).orElseThrow();
        return userFromDB.getStatement().stream()
                .map(statementMapper::toStatementDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void setEnableForUserById(Integer userId, boolean enable) {
        UserEntity userEntityFromDB = userRepository.findById(userId).orElseThrow();
        userEntityFromDB.setEnable(enable);
        userRepository.save(userEntityFromDB);
    }
}

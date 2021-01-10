package com.ua.knuca.committee.mapper;

import com.ua.knuca.committee.dto.UserDTO;
import com.ua.knuca.committee.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toUserDTO(UserEntity userEntity);
}

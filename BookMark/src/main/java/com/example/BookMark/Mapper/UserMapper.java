package com.example.BookMark.Mapper;


import com.example.BookMark.Entity.UserEntity;
import com.example.BookMark.RequestDTO.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity dtoToEntity(UserDTO dto);
    UserDTO entityToDto(UserEntity entity);
}

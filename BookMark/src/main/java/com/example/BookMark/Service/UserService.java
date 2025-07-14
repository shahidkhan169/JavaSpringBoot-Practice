package com.example.BookMark.Service;
import java.util.*;
import java.util.stream.*;

import com.example.BookMark.Entity.UserEntity;
import com.example.BookMark.Mapper.UserMapper;
import com.example.BookMark.RequestDTO.UserDTO;
import com.example.BookMark.ServiceInterfaces.UserInterface;
import com.example.BookMark.ServiceRepository.UserServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserInterface{

    @Autowired
    private UserServiceRepo userRepo;

    @Autowired
    private UserMapper userMapper;

    public UserDTO createUser(UserDTO userDTO)
    {
        UserEntity user=userMapper.dtoToEntity(userDTO);
        UserEntity savedUser = userRepo.save(user);
        return userMapper.entityToDto(savedUser);
    }

    public List<UserDTO> displayAllUsers()
    {
        List<UserEntity> list=userRepo.findAll();
        return list.stream().map(userMapper::entityToDto).collect(Collectors.toList());
    }

    public List<UserDTO> sortedUsers()
    {
        List<UserEntity> list=userRepo.findAll();
        return list.stream().map(userMapper::entityToDto).sorted(Comparator.comparing(UserDTO::getName)).collect(Collectors.toList());
    }

}

package com.example.BookMark.ServiceInterfaces;
import java.util.*;
import com.example.BookMark.RequestDTO.UserDTO;

public interface UserInterface {
        public UserDTO createUser(UserDTO user);
        public List<UserDTO> displayAllUsers();
        public List<UserDTO> sortedUsers();
 }

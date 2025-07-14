package com.example.BookMark.Controller;


import com.example.BookMark.RequestDTO.UserDTO;
import com.example.BookMark.Response.ApiResponse;
import com.example.BookMark.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    ResponseEntity<ApiResponse> createUser(@Valid @RequestBody UserDTO userDto){
        UserDTO savedUser=userService.createUser(userDto);
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(),"Success",savedUser,"User Created Successfully"));
    }

    @GetMapping("/displayAllUsers")
    ResponseEntity<ApiResponse> displayAllUsers()
    {
        List<UserDTO> list=userService.displayAllUsers();
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(),"Success",list,"List of Users"));
    }

    @GetMapping("/sortedUsers")
    ResponseEntity<ApiResponse> sortedUsers()
    {
        List<UserDTO> list=userService.sortedUsers();
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(),"Success",list,"Sorted List of Users"));
    }
}

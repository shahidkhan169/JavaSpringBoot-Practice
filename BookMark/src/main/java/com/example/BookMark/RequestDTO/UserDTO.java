package com.example.BookMark.RequestDTO;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Enter valid Email")
    @NotBlank(message = "Email is required")
    private String email;

    @Size(min = 8,message = "Password must at least 8 characters")
    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Usertype is required")
    private String userType;
}

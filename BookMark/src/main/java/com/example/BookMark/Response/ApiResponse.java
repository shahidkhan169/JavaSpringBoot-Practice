package com.example.BookMark.Response;

import com.example.BookMark.RequestDTO.UserDTO;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private int statusCode;
    private String status;
    private Object payload;
    private String message;
}

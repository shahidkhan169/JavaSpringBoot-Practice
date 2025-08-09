package com.example.BookMark.Controller;

import com.example.BookMark.RequestDTO.BookDTO;
import com.example.BookMark.Response.ApiResponse;
import com.example.BookMark.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/createBook")
    ResponseEntity<ApiResponse> createBook(@Valid @RequestBody BookDTO bookDTO)
    {
        BookDTO savedBook=bookService.createBook(bookDTO);
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(),"Success",savedBook,"Created Book Successfully"));
    }

    @GetMapping("/displayBooks")
    ResponseEntity<ApiResponse> findAllBooks(){
        List<BookDTO> list=bookService.findAllBooks();
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(),"Success",list,"All Books"));
    }

    @PostMapping("findByName")
    ResponseEntity<ApiResponse> findByName(@)
}

package com.example.BookMark.ServiceInterfaces;

import com.example.BookMark.RequestDTO.BookDTO;

import java.util.List;

public interface BookInterface {

    public BookDTO createBook(BookDTO bookDTO);
    public List<BookDTO> findAllBooks();

}

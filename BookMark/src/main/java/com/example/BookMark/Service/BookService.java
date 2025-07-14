package com.example.BookMark.Service;


import com.example.BookMark.Entity.BookEntity;
import com.example.BookMark.Mapper.BookMapper;
import com.example.BookMark.RequestDTO.BookDTO;
import com.example.BookMark.ServiceInterfaces.BookInterface;
import com.example.BookMark.ServiceRepository.BookServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService implements BookInterface {

    @Autowired
    private BookServiceRepo bookServiceRepo;

    @Autowired
    private BookMapper bookMapper;

    public BookDTO createBook(BookDTO bookDTO)
    {
        BookEntity bookEntity=bookMapper.dtoTOEntity(bookDTO);
        BookEntity savedBook=bookServiceRepo.save(bookEntity);
        return bookMapper.entityToDto(savedBook);
    }

    public List<BookDTO> findAllBooks()
    {
        List<BookEntity> list=bookServiceRepo.findAll();
        return list.stream().map(bookMapper::entityToDto).collect(Collectors.toList());
    }
}

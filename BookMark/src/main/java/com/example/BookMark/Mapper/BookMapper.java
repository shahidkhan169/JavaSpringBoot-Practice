package com.example.BookMark.Mapper;

import com.example.BookMark.Entity.BookEntity;
import com.example.BookMark.RequestDTO.BookDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO entityToDto(BookEntity entity);
    BookEntity dtoTOEntity(BookDTO dto);
}

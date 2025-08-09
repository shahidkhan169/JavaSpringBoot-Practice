package com.example.BookMark.ServiceRepository;


import com.example.BookMark.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookServiceRepo extends JpaRepository<BookEntity,Integer> {
    BookEntity findByBookName(String bookName);
}

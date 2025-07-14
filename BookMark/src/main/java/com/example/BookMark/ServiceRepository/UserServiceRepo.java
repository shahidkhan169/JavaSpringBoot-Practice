package com.example.BookMark.ServiceRepository;

import com.example.BookMark.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserServiceRepo extends JpaRepository<UserEntity,Integer> {

}

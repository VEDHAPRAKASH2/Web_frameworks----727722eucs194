package com.day9.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day9.q1.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    @Query("SELECT u from User u where u.userId = ?1")
    User findById(int userId);

    @Query("SELECT u from User u where u.userName = ?1")
    User findByName(String userName);
}

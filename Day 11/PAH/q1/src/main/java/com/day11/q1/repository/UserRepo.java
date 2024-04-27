package com.day11.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q1.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    User findById(int id);
}

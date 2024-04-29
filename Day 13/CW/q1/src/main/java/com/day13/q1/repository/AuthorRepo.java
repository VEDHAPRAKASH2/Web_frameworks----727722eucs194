package com.day13.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q1.model.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer>{
    Author findById(int id);
}

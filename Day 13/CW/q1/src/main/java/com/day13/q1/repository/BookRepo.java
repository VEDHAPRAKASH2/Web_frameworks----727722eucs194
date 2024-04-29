package com.day13.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q1.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
    Book findById(int id);
}

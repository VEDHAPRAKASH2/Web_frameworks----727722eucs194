package com.day14.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day14.q2.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
    Book findById(int id);
}

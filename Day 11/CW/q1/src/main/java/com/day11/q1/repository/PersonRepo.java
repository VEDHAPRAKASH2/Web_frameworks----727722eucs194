package com.day11.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{
    Person findById(int id);
}

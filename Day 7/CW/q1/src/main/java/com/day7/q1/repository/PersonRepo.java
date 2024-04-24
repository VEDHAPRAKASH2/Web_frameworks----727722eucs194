package com.day7.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day7.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{ 
    @Query("SELECT p FROM Person p WHERE p.age = :age")
    List<Person> findAllByAge(int age); 
} 

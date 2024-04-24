package com.day9.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day9.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{
    @Query("SELECT p from Person p where p.age = ?1")
    List<Person> findByAge(int age);
}

package com.day8.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day8.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{
    @Query("SELECT p from Person p where p.name LIKE :str%")
    List<Person> findAllByFirstName(String str);
    @Query("SELECT p from Person p where p.name LIKE %:str")
    List<Person> findAllByLastName(String str);
}

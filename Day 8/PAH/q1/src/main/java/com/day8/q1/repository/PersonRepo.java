package com.day8.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day8.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{
    @Query("SELECT p from Person p where p.lastname != ?1")
    List<Person> findByLastNameNot(String lastname);

    @Query("SELECT p from Person p where p.age not in ?1")
    List<Person> findByAgeNot(List<Integer> age);
}

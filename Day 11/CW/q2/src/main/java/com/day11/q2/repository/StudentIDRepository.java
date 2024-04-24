package com.day11.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q2.model.StudentIDCard;

public interface StudentIDRepository extends JpaRepository<StudentIDCard,Integer>{
    
}

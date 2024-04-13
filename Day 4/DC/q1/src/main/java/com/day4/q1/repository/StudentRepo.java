package com.day4.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.q1.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{   
}
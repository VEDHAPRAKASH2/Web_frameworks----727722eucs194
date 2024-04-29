package com.day13.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
  Student findById(int id);
} 

package com.day11.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q2.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    Student findById(int id);
}

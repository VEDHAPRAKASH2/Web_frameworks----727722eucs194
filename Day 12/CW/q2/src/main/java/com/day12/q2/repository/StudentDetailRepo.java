package com.day12.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day12.q2.model.StudentDetail;

public interface StudentDetailRepo extends JpaRepository<StudentDetail,Integer>{
    StudentDetail findById(int id);
}
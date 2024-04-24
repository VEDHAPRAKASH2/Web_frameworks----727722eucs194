package com.day8.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day8.q3.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Query("SELECT s from Student s where s.marks>?1")
    public List<Student> findAllByGreater(int mark);
    @Query("SELECT s from Student s where s.marks<?1")
    public List<Student> findAllByLesser(int mark);
}

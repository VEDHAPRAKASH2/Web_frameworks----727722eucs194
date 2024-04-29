package com.day13.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q2.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer>{
    Department findById(int id);
}

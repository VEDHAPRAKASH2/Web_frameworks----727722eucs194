package com.day12.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day12.q1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    Employee findById(int id);
}

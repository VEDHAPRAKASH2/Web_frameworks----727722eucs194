package com.day5.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.q2.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
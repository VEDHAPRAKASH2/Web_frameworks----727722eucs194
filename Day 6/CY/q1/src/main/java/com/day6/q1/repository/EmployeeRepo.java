package com.day6.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.q1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
}

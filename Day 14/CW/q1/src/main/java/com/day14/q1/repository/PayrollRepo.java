package com.day14.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day14.q1.model.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll,Integer>{
    Payroll findById(int id);
}

package com.day4.q1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q1.model.Employee;
import com.day4.q1.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo r;

    public List<Employee> getAll()
    {
        return r.findAll();
    }

    public Optional<Employee> get(int i)
    {
        return r.findById(i);
    }

    public Employee put(Employee e)
    {
        return r.save(e);
    }
}

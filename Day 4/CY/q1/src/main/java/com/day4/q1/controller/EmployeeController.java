package com.day4.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.q1.model.Employee;
import com.day4.q1.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService s;

    @GetMapping("api/employees")
    public List<Employee> getAll()
    {
        return s.getAll();
    }

    @GetMapping("api/employee/{employeeId}")
    public Optional<Employee> get(@PathVariable int employeeId)
    {
        return s.get(employeeId);
    }

    @PostMapping("api/employee")
    public Employee put(@RequestBody Employee e)
    {
        return s.put(e);
    }
}

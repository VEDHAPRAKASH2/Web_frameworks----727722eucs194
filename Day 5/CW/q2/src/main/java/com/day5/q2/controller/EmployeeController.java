package com.day5.q2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.q2.model.Employee;
import com.day5.q2.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService s;

    @PostMapping(path = "/api/employee")
    public Employee post(@RequestBody Employee e)
    {
        return s.post(e);
    }

    @PutMapping("/api/employee/{employeeId}")
    public Employee put(@RequestBody Employee e)
    {
        return s.put(e);
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public void delete(@PathVariable int employeeId)
    {
        s.delete(employeeId);
    }
}

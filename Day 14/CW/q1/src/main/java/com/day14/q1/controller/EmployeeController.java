package com.day14.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day14.q1.model.Employee;
import com.day14.q1.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService ser;

    @Tag(name="Employee Controller",description = "all controller")
    @PostMapping("/employee")
    public Employee post(@RequestBody Employee e)
    {
        return ser.post(e);
    }

    @GetMapping("/employee")
    public List<Employee> getAll()
    {
        return ser.getAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee get(@PathVariable int employeeId)
    {
        return ser.get(employeeId);
    }
}
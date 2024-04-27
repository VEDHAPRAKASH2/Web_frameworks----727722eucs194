package com.day12.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day12.q1.model.Employee;
import com.day12.q1.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService ser;

    @PostMapping("/employee")
    public Employee post(@RequestBody Employee e)
    {
        return ser.post(e);
    }

    @GetMapping("/employees-inner-join")
    public List<Employee> innerjoin()
    {
        return ser.innerjoin();
    }
    
    @GetMapping("/employees-left-outer-join")
    public List<Employee> leftjoin()
    {
        return ser.leftjoin();
    }
}

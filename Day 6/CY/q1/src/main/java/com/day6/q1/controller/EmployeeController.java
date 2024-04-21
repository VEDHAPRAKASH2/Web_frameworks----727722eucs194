package com.day6.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day6.q1.model.Employee;
import com.day6.q1.service.EmployeeService;

@RestController 
public class EmployeeController {
    @Autowired
    EmployeeService s;

    @PostMapping("/api/employee")
    public Employee post(@RequestBody Employee e)
    {
        return s.post(e);
    }

    @GetMapping("/api/employee/sortBy/{field}")
    public List<Employee> post(@PathVariable("field") String field)
    {
        return s.getSort(field);
    }

    @GetMapping("/api/employee/{offset}/{pagesize}")
    public List<Employee> post(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
    {
        return s.get(offset, pagesize);
    }

    @GetMapping("/api/employee/{offset}/{pagesize}/{field}")
    public List<Employee> post(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable String field)
    {
        return s.get(offset, pagesize,field);
    }
}

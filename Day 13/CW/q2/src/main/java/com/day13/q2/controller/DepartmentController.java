package com.day13.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day13.q2.model.Department;
import com.day13.q2.service.DepartmentService;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService ser;

    @PostMapping("/department")
    public Department post(@RequestBody Department d)
    {
        return ser.post(d);
    }
    
    @GetMapping("/department")
    public List<Department> getAll()
    {
        return ser.getAll();
    }
}

package com.day4.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day4.q1.model.Student;
import com.day4.q1.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping(path = "/api/student")
    public Student p1(@RequestBody Student m)
    {
        return service.putStudent(m);
    }
    
    @GetMapping("/api/student")
    public List<Student> g1()
    {
        return service.getAllStudents();
    }

    @GetMapping("/api/student/{id}")
    public Optional<Student> g2(@PathVariable int id)
    {
        return service.getStudent(id);
    }
}

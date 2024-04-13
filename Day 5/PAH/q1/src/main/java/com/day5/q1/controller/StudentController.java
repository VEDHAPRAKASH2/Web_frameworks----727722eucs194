package com.day5.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day5.q1.model.Student;
import com.day5.q1.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping(path = "/student")
    public Student p1(@RequestBody Student m)
    {
        return service.putStudent(m);
    }
    
    @GetMapping("/student")
    public List<Student> g1()
    {
        return service.getAllStudents();
    }

    @GetMapping("/student/{studentId}")
    public Optional<Student> g2(@PathVariable int studentId)
    {
        return service.getStudent(studentId);
    }

    @PutMapping("/student/{studentId}")
    public Student p2(@RequestBody Student s)
    {
        return service.updateStudent(s);
    }

    @DeleteMapping("/student/{studentId}")
    public void p2(@PathVariable int studentId)
    {
        service.deleteStudent(studentId);
    }
}

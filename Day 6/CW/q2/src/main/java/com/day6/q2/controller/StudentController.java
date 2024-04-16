package com.day6.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.q2.model.Student;
import com.day6.q2.service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    StudentService service;

    @PostMapping("/api/student")
    public Student post(@RequestBody Student s)
    {
        return service.post(s);
    }

    @GetMapping("/api/student")
    public List<Student> get(@RequestParam int pageNo,@RequestParam int pageSize)
    {
        return service.get(pageNo, pageSize);
    }

    @GetMapping("/api/student/sort")
    public List<Student> get(@RequestParam int pageNo,@RequestParam int pageSize,@RequestParam String sortBy)
    {
        return service.getAndSort(pageNo, pageSize, sortBy);
    }
}

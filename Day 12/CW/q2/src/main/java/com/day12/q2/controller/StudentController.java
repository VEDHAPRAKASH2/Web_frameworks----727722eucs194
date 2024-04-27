package com.day12.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day12.q2.model.Student;
import com.day12.q2.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;

    @PostMapping("/student")
    public Student post(@RequestBody Student s)
    {
        return ser.post(s);
    }

    @GetMapping("students-inner-join")
    public List<Student> innerjoin()
    {
        return ser.innerjoin();
    }

    @GetMapping("students-left-outer-join")
    public List<Student> leftjoin()
    {
        return ser.leftjoin();
    }
}

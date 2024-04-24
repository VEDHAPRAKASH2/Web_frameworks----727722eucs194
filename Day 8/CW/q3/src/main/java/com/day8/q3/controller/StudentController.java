package com.day8.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day8.q3.model.Student;
import com.day8.q3.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;

    @PostMapping("/student")
    public Student post(@RequestBody Student s)
    {
        return ser.post(s);
    }

    @GetMapping("/student/marksGreaterThan/{mark}")
    public List<Student> getByGreater(@PathVariable int mark)
    {
        return ser.findAllByGreater(mark);
    }

    @GetMapping("/student/marksLessThan/{mark}")
    public List<Student> getByLesser(@PathVariable int mark)
    {
        return ser.findAllByLesser(mark);
    }
}

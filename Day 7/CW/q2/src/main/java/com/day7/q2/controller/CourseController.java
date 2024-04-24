package com.day7.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day7.q2.model.Course;
import com.day7.q2.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    CourseService ser;

    @PostMapping("/api/course")
    public Course post(@RequestBody Course c)
    {
        return ser.post(c);
    }

    @GetMapping("/api/course")
    public List<Course> get()
    {
        return ser.get();
    }

    @GetMapping("/api/course/{courseName}")
    public List<Course> get(@PathVariable("courseName") String courseName)
    {
        return ser.get(courseName);
    }
}
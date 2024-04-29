package com.day13.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day13.q1.model.Course;
import com.day13.q1.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    CourseService ser;

    @PostMapping("/course")
    public Course post(@RequestBody Course c)
    {
        return ser.post(c);
    }

    @GetMapping("/course/{courseId}")
    public Course get(@PathVariable int courseId)
    {
        return ser.get(courseId);
    }

    @GetMapping("/course")
    public List<Course> getAll()
    {
        return ser.getAll();
    }
}

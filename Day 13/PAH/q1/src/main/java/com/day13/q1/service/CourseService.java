package com.day13.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day13.q1.model.Course;
import com.day13.q1.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository r;

    public Course post(@RequestBody Course c)
    {
        return r.save(c);
    }

    public List<Course> getAll()
    {
        return r.findAll();
    }

    public Course get(int courseId)
    {
        return r.findById(courseId);
    }
}
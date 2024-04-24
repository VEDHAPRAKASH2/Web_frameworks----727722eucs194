package com.day7.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.q2.model.Course;
import com.day7.q2.repository.CourseRepo;

@Service
public class CourseService {
    
    @Autowired
    CourseRepo r;

    public Course post(Course c)
    {
        return r.save(c);
    }

    public List<Course> get()
    {
        return r.findAll();
    }

    public List<Course> get(String courseName)
    {
        return r.findAllByCourseName(courseName);
    }
}

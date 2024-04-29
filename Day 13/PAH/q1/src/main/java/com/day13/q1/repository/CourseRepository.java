package com.day13.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q1.model.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{
    Course findById(int id);
}

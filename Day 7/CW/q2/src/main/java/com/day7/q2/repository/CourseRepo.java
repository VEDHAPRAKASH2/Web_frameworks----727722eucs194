package com.day7.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day7.q2.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{
    @Query("Select c from Course c where c.courseName = ?1")
    List<Course> findAllByCourseName(String courseName);
}

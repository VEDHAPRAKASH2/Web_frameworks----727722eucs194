package com.day13.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.q1.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson,Integer>{
    Lesson findById(int id);
}

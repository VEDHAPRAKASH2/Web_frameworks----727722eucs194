package com.day13.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day13.q1.model.Course;
import com.day13.q1.model.Lesson;
import com.day13.q1.repository.CourseRepository;
import com.day13.q1.repository.LessonRepository;

@Service
public class LessonService {
    @Autowired
    CourseRepository cr;
    @Autowired
    LessonRepository lr;

    public Lesson post(Lesson l,int courseId)
    {
        Course c = cr.findById(courseId);
        List<Lesson> lessons = c.getLesson();
        lessons.add(l);
        c.setLesson(lessons);
        cr.save(c);
        return l;
    }
}

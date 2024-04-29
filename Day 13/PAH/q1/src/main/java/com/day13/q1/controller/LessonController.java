package com.day13.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day13.q1.model.Lesson;
import com.day13.q1.service.LessonService;

@RestController
public class LessonController {
    @Autowired
    LessonService ser;

    @PostMapping("/lesson/course/{courseId}")
    public Lesson post(@RequestBody Lesson l,@PathVariable int courseId)
    {
        return ser.post(l, courseId);
    }
}

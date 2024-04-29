package com.day13.q1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Lesson {
    @Id
    @GeneratedValue
    int lessonId;

    String title,content;

    @ManyToOne
    @JsonBackReference
    Course course;

    public Lesson() {
    }

    public Lesson(int lessonId, String title, String content, Course course) {
        this.lessonId = lessonId;
        this.title = title;
        this.content = content;
        this.course = course;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }    
}

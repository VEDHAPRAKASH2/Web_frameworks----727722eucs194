package com.day7.q2.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int courseId;

    int creditHours,maxCapacity;

    String courseName,instructor,preRequisites,enrolledStudents;

    public Course() {
    }

    public Course(int courseId, int creditHours, int maxCapacity, String courseName, String instructor,
            String preRequisites, String enrolledStudents) {
        this.courseId = courseId;
        this.creditHours = creditHours;
        this.maxCapacity = maxCapacity;
        this.courseName = courseName;
        this.instructor = instructor;
        this.preRequisites = preRequisites;
        this.enrolledStudents = enrolledStudents;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getPreRequisites() {
        return preRequisites;
    }

    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }

    public String getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(String enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

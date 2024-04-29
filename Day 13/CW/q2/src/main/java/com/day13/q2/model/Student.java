package com.day13.q2.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int studentId;

    String name,email;

    int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id")
    Department department;


    public Student() {
    }


    public Student(int studentId, String name, String email, int age, Department department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.department = department;
    }


    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }
}

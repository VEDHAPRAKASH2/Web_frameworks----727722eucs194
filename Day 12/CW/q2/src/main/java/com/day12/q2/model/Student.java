package com.day12.q2.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id",referencedColumnName = "id")
    StudentDetail studentDetail;

    public Student() {
    }

    public Student(int id, String name, int age, StudentDetail studentDetail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studentDetail = studentDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentDetail getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(StudentDetail studentDetail) {
        this.studentDetail = studentDetail;
    }
}

package com.day11.q2.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id")
    StudentIDCard studentIDCard;

    public Student() {
    }

    public Student(long id, String name, StudentIDCard studentIDCard) {
        this.id = id;
        this.name = name;
        this.studentIDCard = studentIDCard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }

    public void setStudentIDCard(StudentIDCard studentIDCard) {
        this.studentIDCard = studentIDCard;
    }

    
}

package com.day12.q1.model;

import jakarta.persistence.*;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    
    int age;

    @OneToOne(cascade = CascadeType.ALL)
    License license;

    public Driver() {
    }

    public Driver(int id, String name, int age, License license) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.license = license;
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

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}

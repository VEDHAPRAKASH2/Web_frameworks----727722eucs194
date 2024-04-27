package com.day12.q2.model;

import jakarta.persistence.*;

@Entity
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String address,phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "studentDetail")
    Student student;

    public StudentDetail() {
    }

    public StudentDetail(int id, String address, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

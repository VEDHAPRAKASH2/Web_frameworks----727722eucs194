package com.day11.q1.model;

import jakarta.persistence.*;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String number;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userProfile")
    User user;

    public UserProfile() {
     
    }

    public UserProfile(long id, String number) {
        this.id = id;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

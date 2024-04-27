package com.day11.q1.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id",referencedColumnName = "id")
    UserProfile userProfile;

    public User() {
    }

    public User(long id, String username, UserProfile userProfile) {
        this.id = id;
        this.username = username;
        this.userProfile = userProfile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}

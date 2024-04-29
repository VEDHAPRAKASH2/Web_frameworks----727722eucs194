package com.day14.q1.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    int userId;

    String userName,userRole;

    int userAge;

    public User() {
    }

    public User(int userId, String userName, String userRole, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
        this.userAge = userAge;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}

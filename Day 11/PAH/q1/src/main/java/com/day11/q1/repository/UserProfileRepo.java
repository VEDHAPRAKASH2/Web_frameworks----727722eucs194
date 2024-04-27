package com.day11.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q1.model.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile,Integer>{
    UserProfile findById(int id);
}

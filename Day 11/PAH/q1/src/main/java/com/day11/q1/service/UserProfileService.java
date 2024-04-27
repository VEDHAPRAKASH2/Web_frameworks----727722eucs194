package com.day11.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day11.q1.model.User;
import com.day11.q1.model.UserProfile;
import com.day11.q1.repository.UserProfileRepo;
import com.day11.q1.repository.UserRepo;

@Service
public class UserProfileService {
    @Autowired
    UserProfileRepo r;
    @Autowired
    UserRepo rep;

    public UserProfile post(UserProfile u,int id)
    {
        User user = rep.findById(id); 
        user.setUserProfile(u);
        rep.save(user);
        return u;
    }
}

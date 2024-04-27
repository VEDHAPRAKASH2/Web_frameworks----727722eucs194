package com.day11.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day11.q1.model.UserProfile;
import com.day11.q1.service.UserProfileService;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileService ser;

    @PostMapping("/profile/user/{userId}")
    public UserProfile update(@RequestBody UserProfile u,@PathVariable int userId)
    {
        return ser.post(u, userId);
    }    
}

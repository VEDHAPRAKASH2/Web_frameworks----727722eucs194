package com.day9.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9.q1.model.User;
import com.day9.q1.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo r;
    
    public User post(User u)
    {
        return r.save(u);
    }

    public User getByUserId(int userId)
    {
        return r.findById(userId);
    }

    public User getByUserName(String name)
    {
        return r.findByName(name);
    }
}

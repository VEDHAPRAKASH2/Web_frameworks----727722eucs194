package com.day14.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day14.q1.model.User;
import com.day14.q1.repository.UserRepo;


@Service
public class UserService {
    @Autowired
    UserRepo r;

    public User post(User b)
    {
        return r.save(b);
    }

    public User put(User b)
    {
        return r.save(b);
    }

    public List<User> getAll()
    {
        return r.findAll();
    }

    public User get(int id)
    {
        return r.findById(id);
    }
}

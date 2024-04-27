package com.day9.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day9.q1.model.User;
import com.day9.q1.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService ser;

    @PostMapping("/api/user")
    public User post(@RequestBody User u)
    {
        return ser.post(u);
    }

    @GetMapping("/api/user/{userId}")
    public User getByUserId(@PathVariable int userId)
    {
        return ser.getByUserId(userId);
    }

    @GetMapping("/api/user/byname/{userName}")
    public User getByUserName(@PathVariable String userName)
    {
        return ser.getByUserName(userName);
    }
}

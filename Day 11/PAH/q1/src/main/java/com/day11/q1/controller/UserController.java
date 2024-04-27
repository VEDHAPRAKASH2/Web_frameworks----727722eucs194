package com.day11.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day11.q1.model.User;
import com.day11.q1.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService ser;

    @PostMapping("/user")
    public User post(@RequestBody User u)
    {
        return ser.post(u);
    }

    @PutMapping("/user/{userId}")
    public User put(@RequestBody User u,@PathVariable int userId)
    {
        return ser.update(u);
    }
}

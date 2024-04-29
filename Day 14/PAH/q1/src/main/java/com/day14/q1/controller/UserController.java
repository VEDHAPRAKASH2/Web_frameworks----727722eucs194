package com.day14.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day14.q1.model.User;
import com.day14.q1.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class UserController {
    @Autowired
    UserService ser;

    @Tag(name = "User Controller")
    @PostMapping("/api/user")
    public User post(@RequestBody User b)
    {
        return ser.post(b);
    }
    
    @Tag(name = "User Controller")
    @PutMapping("/api/user/{userId}")
    public User put(@RequestBody User b,@PathVariable int userId)
    {
        return put(b, userId);
    }
    
    @Tag(name = "User Controller")
    @GetMapping("/api/user")
    public List<User> getAll()
    {
        return ser.getAll();
    }
    
    @Tag(name = "User Controller")
    @GetMapping("/api/user/{userId}")
    public User get(@PathVariable int userId)
    {
        return ser.get(userId);
    }
}

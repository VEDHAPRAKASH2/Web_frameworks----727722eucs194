package com.day9.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day9.q1.service.PersonService;
import com.day9.q1.model.Person;

@RestController
public class PersonController {
    @Autowired
    PersonService ser;

    @PostMapping("/api/person")
    public Person post(@RequestBody Person p)
    {
        return ser.post(p);
    }

    @GetMapping("api/person/byage/{age}")
    public List<Person> getByAge(@PathVariable int age)
    {
        return ser.getByAge(age);
    }
}

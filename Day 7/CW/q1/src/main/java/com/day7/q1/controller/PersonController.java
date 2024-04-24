package com.day7.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day7.q1.model.Person;
import com.day7.q1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService ser;

    @PostMapping("/api/person")
    public Person post(@RequestBody Person p)
    {
        return ser.post(p);
    }

    @GetMapping ("/api/person")
    public List<Person> get()
    {
        return ser.get();
    }

    @GetMapping("/api/person/byAge")
    public List<Person> get(@RequestParam int age)
    {
        return ser.getByAge(age);
    }
}
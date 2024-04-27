package com.day8.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day8.q1.model.Person;
import com.day8.q1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService ser;

    @PostMapping("/person")
    public Person post(@RequestBody Person p)
    {
        return ser.post(p);
    }

    @GetMapping("/person/findByLastnameNot")
    public List<Person> getNotLastName(@RequestParam String lastname)
    {
        return ser.getNotLastName(lastname);
    }

    @GetMapping("/person/findByAgeNotIn")
    public List<Person> post(@RequestParam List<Integer> age)
    {
        return ser.getNotAge(age);
    }
}

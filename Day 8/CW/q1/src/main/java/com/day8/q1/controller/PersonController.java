package com.day8.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/person/startsWithName/{value}")
    public List<Person> getByFirst(@PathVariable String value)
    {
        return ser.getByFirstName(value);
    }
    
    @GetMapping("/person/endsWithName/{value}")
    public List<Person> getByLast(@PathVariable String value)
    {
        return ser.getByLastName(value);
    }
}

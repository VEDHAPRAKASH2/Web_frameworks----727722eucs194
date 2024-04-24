package com.day11.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day11.q1.model.Address;
import com.day11.q1.model.Person;
import com.day11.q1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService ser;
    
    @PostMapping("/person")
    public Person post(@RequestBody Person p)
    {
        return ser.post(p);
    }

    @PostMapping("/address/person/{personId}")
    public Person post(@RequestBody Address a,@PathVariable int personId)
    {
        return ser.postAddress(a,personId);
    }

    @GetMapping("/person")
    public List<Person> get()
    {
        return ser.getAll();
    }
    
    @GetMapping("/person/{personId}")
    public Person get(@PathVariable int personId)
    {
        return ser.get(personId);
    }
}

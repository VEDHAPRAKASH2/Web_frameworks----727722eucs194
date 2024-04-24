package com.day9.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9.q1.model.Person;
import com.day9.q1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo r;

    public Person post(Person p)
    {
        return r.save(p);
    }

    public List<Person> getByAge(int age)
    {
        return r.findByAge(age);
    }
}

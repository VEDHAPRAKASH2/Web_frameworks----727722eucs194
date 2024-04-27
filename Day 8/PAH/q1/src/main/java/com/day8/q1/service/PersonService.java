package com.day8.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day8.q1.model.Person;
import com.day8.q1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo r;

    public Person post(Person p)
    {
        return r.save(p);
    }

    public List<Person> getNotLastName(String lastname)
    {
        return r.findByLastNameNot(lastname);
    }

    public List<Person> getNotAge(List<Integer> age) {
        return r.findByAgeNot(age);
    }
}

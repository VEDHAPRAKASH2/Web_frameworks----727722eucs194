package com.day11.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day11.q1.model.Address;
import com.day11.q1.model.Person;
import com.day11.q1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo r;

    public Person post(Person p)
    {
        return r.save(p);
    }

    public Person postAddress(Person p,int personId)
    {
        return r.save(p);
    }

    public List<Person> getAll()
    {
        return r.findAll();
    }

    public Person get(int personId)
    {
        return r.findById(personId);
    }

    public Person postAddress(Address a,int id)
    {
        Person personToUpdate = r.findById(id);
        personToUpdate.setAddress(a);
        return r.save(personToUpdate);
    }
}

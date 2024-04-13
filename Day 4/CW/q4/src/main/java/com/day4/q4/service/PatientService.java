package com.day4.q4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q4.model.Patient;
import com.day4.q4.repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    PatientRepo r;

    public List<Patient> getAll()
    {
        return r.findAll();
    }

    public Optional<Patient> get(int i)
    {
        return r.findById(i);
    }

    public Patient put(Patient p)
    {
        return r.save(p);
    }
}

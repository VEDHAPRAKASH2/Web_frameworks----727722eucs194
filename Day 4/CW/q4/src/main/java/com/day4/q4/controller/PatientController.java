package com.day4.q4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.q4.model.Patient;
import com.day4.q4.service.PatientService;

@RestController
public class PatientController {
    
    @Autowired
    PatientService s;
    
    @GetMapping("/api/patient")
    public List<Patient> g1()
    {
        return s.getAll();
    }

    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> g2(@PathVariable int patientId)
    {
        return s.get(patientId);
    }

    @PostMapping("/api/patient")
    public Patient p(@RequestBody Patient p)
    {
        return s.put(p);
    }
}

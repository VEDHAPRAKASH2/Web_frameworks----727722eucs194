package com.day4.q2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.q2.model.Job;
import com.day4.q2.service.JobService;

@RestController
public class JobController {
    
    @Autowired
    JobService s;

    @GetMapping("/api/job")
    public List<Job> g1()
    {
        return s.getAll();
    }

    @GetMapping("/api/job/{jobId}")
    public Optional<Job> g2(@PathVariable int jobId)
    {
        return s.get(jobId);
    }

    @PostMapping("/api/job")
    public Job p(@RequestBody Job j)
    {
        return s.put(j);
    }
}

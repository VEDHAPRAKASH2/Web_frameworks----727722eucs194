package com.day4.q2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q2.model.Job;
import com.day4.q2.repository.JobRepo;

@Service
public class JobService {
    @Autowired
    JobRepo r;

    public List<Job> getAll()
    {
        return r.findAll();
    }

    public Optional<Job> get(int i)
    {
        return r.findById(i);
    }

    public Job put(Job j)
    {
        return r.save(j);
    }
}

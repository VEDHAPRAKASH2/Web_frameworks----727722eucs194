package com.day4.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.q2.model.Job;

public interface JobRepo  extends JpaRepository<Job,Integer>{
    
}
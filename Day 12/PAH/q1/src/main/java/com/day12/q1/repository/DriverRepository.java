package com.day12.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day12.q1.model.Driver;

public interface DriverRepository extends JpaRepository<Driver,Integer>{
    Driver findById(int id);
}

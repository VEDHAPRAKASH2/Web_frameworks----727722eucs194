package com.day12.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day12.q1.model.License;

public interface LicenseRepository extends JpaRepository<License,Integer>{
    License findById(int id);
}

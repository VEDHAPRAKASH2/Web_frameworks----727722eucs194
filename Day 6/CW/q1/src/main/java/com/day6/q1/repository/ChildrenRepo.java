package com.day6.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.q1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer>{
}
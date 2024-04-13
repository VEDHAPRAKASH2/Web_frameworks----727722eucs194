package com.day5.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.q3.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>{
    
}
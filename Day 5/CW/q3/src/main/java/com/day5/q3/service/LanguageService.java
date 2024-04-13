package com.day5.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q3.model.Language;
import com.day5.q3.repository.LanguageRepo;


@Service
public class LanguageService {

    @Autowired
    LanguageRepo r;

    public List<Language> getAll()
    {
        return r.findAll();
    }

    public Optional<Language> get(int i)
    {
        return r.findById(i);
    }

    public Language post(Language e)
    {
        return r.save(e);
    }

    public Language put(Language e)
    {
        return r.save(e);
    }

    public void delete(int i)
    {
        r.deleteById(i);
    }
}
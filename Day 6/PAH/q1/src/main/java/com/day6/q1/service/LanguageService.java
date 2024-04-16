package com.day6.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q1.model.Language;
import com.day6.q1.repository.LanguageRepo;

@Service
public class LanguageService {
    
    @Autowired
    LanguageRepo r;

    public Language post(Language l)
    {
        return r.save(l);
    }

    public List<Language> getSort(String field)
    {
        return r.findAll(PageRequest.of(0, r.findAll().size(),Sort.by(field))).getContent();
    }

    public List<Language> get(int offset, int pagesize)
    {
        return r.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    
    public List<Language> get(int offset, int pagesize, String field)
    {
        return r.findAll(PageRequest.of(offset, pagesize, Sort.by(field))).getContent();
    }
}

package com.day6.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day6.q1.model.Language;
import com.day6.q1.service.LanguageService;

@RestController
public class LanguageController {
    @Autowired
    LanguageService s;

    @PostMapping("/api/language")
    public Language post(@RequestBody Language l)
    {
        return s.post(l);
    }

    @GetMapping("/api/language/sortBy/{field}")
    public List<Language> get(@PathVariable String field)
    {
        return s.getSort(field);
    }
    
    @GetMapping("/api/language/{offset}/{pagesize}")
    public List<Language> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
    {
        return s.get(offset, pagesize);
    }
    
    @GetMapping("/api/language/{offset}/{pagesize}/{field}")
    public List<Language> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field)
    {
        return s.get(offset, pagesize, field);
    }
}

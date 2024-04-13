package com.day5.q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.q3.model.Language;
import com.day5.q3.service.LanguageService;


@RestController
public class LanguageController {
    
    @Autowired
    LanguageService s;

    @GetMapping("/language")
    public List<Language> getAll()
    {
        return s.getAll();
    }

    @GetMapping("/language/{languageId}")
    public Optional<Language> get(@PathVariable int languageId)
    {
        return s.get(languageId);
    }
    
    @PostMapping(path = "/language")
    public Language post(@RequestBody Language e)
    {
        return s.post(e);
    }

    @PutMapping("/language/{languageId}")
    public Language put(@RequestBody Language e)
    {
        return s.put(e);
    }
    
    @DeleteMapping("/language/{languageId}")
    public void delete(@PathVariable int languageId)
    {
        s.delete(languageId);
    }
}

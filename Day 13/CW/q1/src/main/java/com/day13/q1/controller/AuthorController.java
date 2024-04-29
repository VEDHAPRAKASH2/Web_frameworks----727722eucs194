package com.day13.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day13.q1.model.Author;
import com.day13.q1.service.AuthorService;

@RestController
public class AuthorController {
    @Autowired
    AuthorService ser;

    @PostMapping("/author")
    public Author post(@RequestBody Author a)
    {
        return ser.post(a);
    }

    @GetMapping("/author")
    public List<Author> getAllAuthors()
    {
        return ser.getAllAuthors();
    }

    @GetMapping("/author/{authorId}")
    public Author getAuthor(@PathVariable int authorId)
    {
        return ser.getAuthor(authorId);
    }

    @PutMapping("/author/{authorId}")
    public Author updateAuthor(@RequestBody Author a,@PathVariable int authorId)
    {
        return ser.updateAuthor(a,authorId);
    }
}

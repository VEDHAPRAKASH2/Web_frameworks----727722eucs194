package com.day13.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day13.q1.model.Author;
import com.day13.q1.repository.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo r;

    public Author post(Author a)
    {
        return r.save(a);
    }

    public List<Author> getAllAuthors()
    {
        return r.findAll();
    }

    public Author getAuthor(int id)
    {
        return r.findById(id);
    }

    public Author updateAuthor(Author a,int authorId)
    {
        Author author = r.findById(authorId);
        author.setAddress(a.getAddress());
        author.setEmail(a.getEmail());
        author.setPhoneNumber(a.getPhoneNumber());
        return r.save(author);
    }
}

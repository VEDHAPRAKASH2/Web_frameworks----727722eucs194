package com.day14.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day14.q2.model.Book;
import com.day14.q2.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo r;

    public Book post(Book b)
    {
        return r.save(b);
    }

    public Book put(Book b)
    {
        return r.save(b);
    }

    public List<Book> getAll()
    {
        return r.findAll();
    }

    public Book get(int id)
    {
        return r.findById(id);
    }
}

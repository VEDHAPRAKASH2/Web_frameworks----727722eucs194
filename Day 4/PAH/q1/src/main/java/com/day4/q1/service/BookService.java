package com.day4.q1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q1.model.Book;
import com.day4.q1.repository.BookRepo;

@Service
public class BookService {

    @Autowired
    BookRepo r;

    public List<Book> getAllBooks()
    {
        return r.findAll();
    }

    public Optional<Book> getBook(int i)
    {
        return r.findById(i);
    }

    public Book putBook(Book s)
    {
        Book abc = r.save(s);
        return abc;
    }
}

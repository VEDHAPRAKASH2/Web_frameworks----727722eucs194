package com.day4.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day4.q1.model.Book;
import com.day4.q1.service.BookService;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping(path = "/api/book")
    public Book p1(@RequestBody Book m)
    {
        return service.putBook(m);
    }
    
    @GetMapping("/api/book")
    public List<Book> g1()
    {
        return service.getAllBooks();
    }

    @GetMapping("/api/book/{bookId}")
    public Optional<Book> g2(@PathVariable int bookId)
    {
        return service.getBook(bookId);
    }
}

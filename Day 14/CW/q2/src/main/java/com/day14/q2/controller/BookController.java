package com.day14.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day14.q2.model.Book;
import com.day14.q2.service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class BookController {
    @Autowired
    BookService ser;

    @Tag(name = "Book Controller")
    @PostMapping("/api/book")
    public Book post(@RequestBody Book b)
    {
        return ser.post(b);
    }

    @PutMapping("/api/book/{bookId}")
    public Book put(@RequestBody Book b,@PathVariable int bookId)
    {
        return put(b, bookId);
    }

    @GetMapping("/api/book")
    public List<Book> getAll()
    {
        return ser.getAll();
    }

    @GetMapping("/api/book/{bookId}")
    public Book get(@PathVariable int bookId)
    {
        return ser.get(bookId);
    }
}

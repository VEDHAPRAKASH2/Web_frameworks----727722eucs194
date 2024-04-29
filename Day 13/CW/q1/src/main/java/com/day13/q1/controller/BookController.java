package com.day13.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day13.q1.model.Book;
import com.day13.q1.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService ser;

    @PostMapping("/book/author/{authorId}")
    public Book post(@RequestBody Book b,@PathVariable int authorId)
    {
        return ser.post(b, authorId);
    }

    @DeleteMapping("/book/{bookId}")
    public String deleteBook(@PathVariable int bookId)
    {
        return ser.deleteBook(bookId);
    }
}

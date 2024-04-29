package com.day13.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day13.q1.model.Author;
import com.day13.q1.model.Book;
import com.day13.q1.repository.AuthorRepo;
import com.day13.q1.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo r;
    @Autowired
    AuthorRepo rep;

    public Book post(Book b,int id)
    {
        Author a = rep.findById(id);
        b.setAuthor(a);
        List<Book> books = a.getBook();
        books.add(b);
        a.setBook(books);
        rep.save(a);
        return b;
    }

    public String deleteBook(int bookId)
    {
        if(r.existsById(bookId))
        {
            Author a = r.findById(bookId).getAuthor();
            List<Book> books = a.getBook();
            books.remove(r.findById(bookId));
            a.setBook(books);
            rep.save(a);
            r.deleteById(bookId);
            return "Book deleted successfully";
        }
        
        return "Book not found with ID:"+bookId;
    }
}
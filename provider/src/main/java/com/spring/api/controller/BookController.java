package com.spring.api.controller;

import com.spring.api.model.Book;
import com.spring.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.findBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @DeleteMapping
    public String deleteAllBooks() {
        bookService.deleteAllBooks();
        return "All books deleted.";
    }
}

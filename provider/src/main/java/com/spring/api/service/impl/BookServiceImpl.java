package com.spring.api.service.impl;

import com.spring.api.model.Book;
import com.spring.api.service.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();
    @PostConstruct
    public void init() {
        books.add(new Book(1, "Spring Boot in Action", "Craig Walls"));
        books.add(new Book(2, "Effective Java", "Joshua Bloch"));
    }
    @Override
    public Book findBookById(int id) {
             System.out.println("Searching for book with ID: " + id);
        return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Book> findAllBooks() {
        return books;
    }

    @Override
    public void deleteAllBooks() {
        books.clear();
    }
}

package com.spring.api.service.impl;

import com.spring.api.model.Book;
import com.spring.api.service.BookService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    @Override
    public Book findBookById(int id) {
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

package com.spring.api.service;

import com.spring.api.model.Book;
import java.util.List;

public interface BookService {
    Book findBookById(int id);
    List<Book> findAllBooks();
    void deleteAllBooks();
}

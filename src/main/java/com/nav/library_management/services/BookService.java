package com.nav.library_management.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.library_management.entity.Books;

@Service
public interface BookService {
    Books addBooks(Books books);

    Books updateBooks(Long id, Books books);

    List<Books> searchBooks();

    Books searchByCategory(Books books);

    void deleteBooks(Long id);

    Books issueBooks();

    Books searchById(Long id);
}

package com.nav.library_management.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.library_management.entity.Books;
import com.nav.library_management.repositoy.BookRepository;
import com.nav.library_management.services.BookService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServicesImpl implements BookService {
    public final BookRepository repo;

    @Override
    public Books addBooks(Books books) {
        return repo.save(books);
    }

    @Override
    public Books updateBooks(Long id, Books books) {
        Books existing = searchById(id);

        existing.setBookName(books.getBookName());
        existing.setAuthorOfBook(books.getAuthorOfBook());
        existing.setCategory(books.getCategory());
        existing.setStockOfBook(books.getStockOfBook());

        return repo.save(existing);
    }

    @Override
    public List<Books> searchBooks() {
        return repo.findAll();
    }

    @Override
    public Books searchById(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new RuntimeException("Student not found"));
    }

    @Override
    public Books searchByCategory(Books books) {
        return null;
    }

    @Override
    public void deleteBooks(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Books issueBooks() {
        return null;
    }

}

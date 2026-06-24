package com.nav.library_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.library_management.entity.Books;
import com.nav.library_management.services.BookService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api/books")
@RestController
@RequiredArgsConstructor
public class BooksController {

    public final BookService bookService;

    @PostMapping
    Books addBooks(@RequestBody Books books) {
        return bookService.addBooks(books);
    };

    @PutMapping("/{id}")
    Books updateBooks(Long id, Books books) {
        return bookService.updateBooks(id, books);
    };

    @GetMapping
    List<Books> searchBooks() {
        return bookService.searchBooks();
    };

    // Books searchByCategory(Books books){
    // return bookService.searchByCategory(books);
    // };

    @DeleteMapping("/{id}")
    void deleteBooks(Long id) {
        bookService.deleteBooks(id);
    };

    // Books issueBooks(){
    // return bookService.issueBooks();
    // };

    @GetMapping("/{id}")
    Books searchById(Long id) {
        return bookService.searchById(id);
    };
}

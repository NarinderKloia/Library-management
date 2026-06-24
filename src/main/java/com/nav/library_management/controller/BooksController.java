package com.nav.library_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    Books updateBooks(@PathVariable Long id, @RequestBody Books books) {
        return bookService.updateBooks(id, books);
    };

    @GetMapping("/{id}")
    Books searchById(@PathVariable Long id) {
        return bookService.searchById(id);
    };

    @GetMapping
    List<Books> searchBooks() {
        return bookService.searchBooks();
    };

    // Books searchByCategory(Books books){
    // return bookService.searchByCategory(books);
    // };

    @DeleteMapping("/{id}")
    String deleteBooks(@PathVariable Long id) {
        bookService.deleteBooks(id);
        return "Book removed successfully";

    };

}

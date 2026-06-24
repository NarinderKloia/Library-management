package com.nav.library_management.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class Books {

    private Long id;
    private String BookName;
    private String AuthorOfBook;
    private Long StockOfBook;
    private String Category;
    private LocalDateTime DateOfAdded;
}

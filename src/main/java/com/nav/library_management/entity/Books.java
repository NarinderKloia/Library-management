package com.nav.library_management.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank(message = "Book name required")
    @Column(nullable = false)
    private String BookName;

    @Column(nullable = false)
    private String AuthorOfBook;

    // @Min(value = 0, message = "Stock cannot less then 0")
    private Integer StockOfBook;

    private String Category;

    private LocalDateTime DateOfAdded;

    @PrePersist
    public void prepersist() {
        this.DateOfAdded = LocalDateTime.now();
    }
}

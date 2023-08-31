package com.library.book.entity;

import com.library.book.model.Author;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name ="BOOK")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ISBN;
    private Long authorId;
    @Transient
    private Author author;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
}


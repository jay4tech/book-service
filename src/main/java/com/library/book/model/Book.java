package com.library.book.model;

import com.library.book.entity.BookStatus;
import lombok.Data;


@Data
public class Book {
    private Long id;
    private String title;
    private String ISBN;
    private BookStatus status;
}


package com.library.book.model;


import lombok.Data;

import java.time.LocalDate;
@Data
public class BorrowingRecord {

    private Long id;

    private Book book;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private String user;
    private Long bookId;
}
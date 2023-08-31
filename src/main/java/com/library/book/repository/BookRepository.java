package com.library.book.repository;


import com.library.book.entity.Book;
import com.library.book.entity.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> getByIdAndStatus(Long id, BookStatus status);

    List<Book> getBooksByAuthorId(Long authorId);
}

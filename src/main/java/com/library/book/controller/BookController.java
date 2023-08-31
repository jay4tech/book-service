package com.library.book.controller;

import com.library.book.entity.Book;
import com.library.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path ="book")
public class BookController {

    @Autowired
    IBookService bookService;

    /**
     * This Api is used to get the book on id
     *
     * @param id
     * @return Book
     */
    @GetMapping(path ="/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    /**
     * This API is used to create the book
     *
     * @param book
     * @return Book
     */
    @PostMapping(path ="/")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    /**
     * This API is used to delete the book
     *
     * @param bookId
     */
    @DeleteMapping(path ="/{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }

    /**
     * This API is used to update the book
     *
     * @param book
     * @return Book
     */
    @PutMapping(path ="/")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @GetMapping(path ="/author/{authorId}")
    public List<Book> getBooksByAuthorId(@PathVariable Long authorId) {
        return bookService.getBooksByAutherId(authorId);
    }
}

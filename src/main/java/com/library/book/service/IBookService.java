package com.library.book.service;


import com.library.book.entity.Book;

import java.util.List;

public interface IBookService {

	Book getBook(Long id);

	Book createBook(Book book);

	void deleteBook(Long id);

	Book updateBook(Book book);

	List<Book> getBooksByAutherId(Long autherId);
}

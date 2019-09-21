package com.cg.demojpa.service;

import com.cg.demojpa.dao.BookDao;
import com.cg.demojpa.dao.IBookDao;
import com.cg.demojpa.dto.Book;

public class BookService implements IBookService {
	
	IBookDao bookDao = new BookDao();

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public Book findBook(int bookIsbn) {
		return bookDao.findBook(bookIsbn);
	}

	@Override
	public boolean removeBook(int bookIsbn) {
		return bookDao.removeBook(bookIsbn);
	}

}

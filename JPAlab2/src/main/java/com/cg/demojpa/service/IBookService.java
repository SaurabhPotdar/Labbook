package com.cg.demojpa.service;

import com.cg.demojpa.dto.Book;

public interface IBookService {
	
	public Book addBook(Book book);
	public Book findBook(int bookIsbn);
	public boolean removeBook(int bookIsbn);

}

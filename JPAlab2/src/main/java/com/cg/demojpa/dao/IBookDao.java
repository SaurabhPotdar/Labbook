package com.cg.demojpa.dao;

import com.cg.demojpa.dto.Book;

public interface IBookDao {
	
	public Book addBook(Book book);
	public Book findBook(int bookIsbn);
	public boolean removeBook(int bookIsbn);

}

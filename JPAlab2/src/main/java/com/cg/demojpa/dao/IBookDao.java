package com.cg.demojpa.dao;

import java.util.List;

import com.cg.demojpa.dto.Book;

public interface IBookDao {
	
	public Book addBook(Book book);
	public Book findBook(int bookIsbn);
	public boolean removeBook(int bookIsbn);
	public List<Book> listOfBook();
	public List<Book> findBookBetweenPrice(double min, double max);
	public List<Book> findBookWrittenByAuthor(String authorName);

}

package com.cg.demojpa.dao;

import java.util.List;

import com.cg.demojpa.dto.Author;

public interface IAuthorDao {
	
	public Author addAuthor(Author author);
	public Author findAuthor(int authorId);
	public boolean removeAuthor(int authorId);
	List<Author> findAllAuthor();
	List<String> findAuthorByBook(int bookIsbn);

}

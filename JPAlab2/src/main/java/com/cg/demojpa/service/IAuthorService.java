package com.cg.demojpa.service;

import com.cg.demojpa.dto.Author;

public interface IAuthorService {
	
	public Author addAuthor(Author author);
	public Author findAuthor(int authorId);
	public boolean removeAuthor(int authorId);

}

package com.cg.demojpa.service;

import com.cg.demojpa.dao.AuthorDao;
import com.cg.demojpa.dao.IAuthorDao;
import com.cg.demojpa.dto.Author;

public class AuthorService implements IAuthorService{

	IAuthorDao authorDao = new AuthorDao();
	
	@Override
	public Author addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	@Override
	public Author findAuthor(int authorId) {
		return authorDao.findAuthor(authorId);
	}

	@Override
	public boolean removeAuthor(int authorId) {
		return authorDao.removeAuthor(authorId);
	}

}

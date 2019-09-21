package com.cg.demojpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.demojpa.dto.Author;

public class AuthorDao implements IAuthorDao {
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("DemoJPA");

	@Override
	public Author addAuthor(Author author) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		if(author==null)
			em.persist(author);
		else
			em.merge(author);
		tran.commit();
		return author;
	}

	@Override
	public Author findAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAuthor(int authorId) {
		// TODO Auto-generated method stub
		return false;
	}

}

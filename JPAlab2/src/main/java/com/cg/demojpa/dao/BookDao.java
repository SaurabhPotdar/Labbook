package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Book;

public class BookDao implements IBookDao {
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("DemoJPA");

	@Override
	public Book addBook(Book book) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		if(book==null)
			em.persist(book);
		else
			em.merge(book);
		tran.commit();
		return book;
	}

	@Override
	public Book findBook(int bookIsbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeBook(int bookIsbn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> listOfBook() {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Book");
		List<Book> bookList = query.getResultList();
		return bookList;
	}

}

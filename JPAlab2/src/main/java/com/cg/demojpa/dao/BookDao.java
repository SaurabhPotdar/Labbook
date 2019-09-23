package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.dto.Book;

public class BookDao implements IBookDao {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction tx;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("DemoJPA");
		entityManager = entityManagerFactory.createEntityManager();
		tx = entityManager.getTransaction();
	}

	@Override
	public boolean removeBook(int bookIsbn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> listOfBook() {
		Query query = entityManager.createQuery("From Book");
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public Book addBook(Book book) {
		tx.begin();
		book.getAuthorList().forEach(author ->{
			author.getBookList().add(book);
		});
		entityManager.persist(book);
		tx.commit();
		return book;
	}

	@Override
	public Book findBook(int bookID) {
		return entityManager.find(Book.class, bookID);
	}

	@Override
	public List<Book> findBookBetweenPrice(double min, double max) {
		Query query = entityManager.createQuery("From Book where bookPrice between :first AND :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> findBookWrittenByAuthor(String authorName) {
		Query query = entityManager.createQuery("FROM Author WHERE authorName=:first");
		query.setParameter("first", authorName);
		Author author = (Author) query.getSingleResult();
		if(author != null)
			return author.getBookList();
		else
			return null;
	}


}

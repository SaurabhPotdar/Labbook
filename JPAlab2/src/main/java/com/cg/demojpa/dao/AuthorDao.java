package com.cg.demojpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.dto.Book;

public class AuthorDao implements IAuthorDao {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction tx;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("DemoJPA");
		entityManager = entityManagerFactory.createEntityManager();
		tx = entityManager.getTransaction();
	}

	@Override
	public Author addAuthor(Author author) {
		tx.begin();
		author.getBookList().forEach(book -> {
			book.getAuthorList().add(author);
		});
		entityManager.persist(author);
		tx.commit();
		return author;
	}

	@Override
	public Author findAuthor(int authorId) {
		return entityManager.find(Author.class, authorId);
	}

	@Override
	public boolean removeAuthor(int authorId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Author> findAllAuthor() {
		Query query = entityManager.createQuery("FROM Author");
		List<Author> authList = query.getResultList();
		return authList;
	}
	
	@Override
	public List<String> findAuthorByBook(int bookIsbn) {
		Book book = entityManager.find(Book.class, bookIsbn);
		if(book != null) {
			List<Author> authList = book.getAuthorList();
			List<String> nameList = new ArrayList<String>();
//			authList.forEach(author -> {
//				nameList.add(author.getAuthorFirstName()+ " " + author.getAuthorMiddleName()+ " " + author.getAuthorLastName());
//			});
			return nameList;
		}
		
		return null;
	}

}

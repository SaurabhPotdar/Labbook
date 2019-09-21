package com.cg.demojpa.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.dto.Book;
import com.cg.demojpa.service.AuthorService;
import com.cg.demojpa.service.IAuthorService;

public class Main {

	public static void main(String[] args) {

		IAuthorService authorService = new AuthorService();
		
		Author author1 = new Author(1, "Paulo");
		Author author2 = new Author(2, "RR Martin");
		
		Book book1 = new Book(4, "The Alchemist", 1000);
		Book book2 = new Book(5, "ASOIAF", 2000);
		Book book3 = new Book(6, "JAVA", 2000);
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		author1.setBookList(bookList);
		
//		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("DemoJPA");
//		EntityManager em = entityFactory.createEntityManager();
//		EntityTransaction tran = em.getTransaction();
//		tran.begin();
//		em.persist(author1);
//		tran.commit();
		
		authorService.addAuthor(author1);
		
		//Add book to a author -- First get author object from the given authorId.
		//Get author list and add book to the author list, then addAuthor.
		
		

	}

}

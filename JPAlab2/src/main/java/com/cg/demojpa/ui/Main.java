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
import com.cg.demojpa.service.BookService;
import com.cg.demojpa.service.IAuthorService;
import com.cg.demojpa.service.IBookService;

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
		
		//authorService.addAuthor(author1);
		
		//Add book to a author -- First get author object from the given authorId.
		//Get author list and add book to the author list, then addAuthor.
		
//		Book book4 = new Book(7, "C++", 2000);
//		bookList.add(book4);
//		bookList.remove(book3);
//		bookList.remove(book4);
//		author2.setBookList(bookList);
//		authorService.addAuthor(author2);
		
		IBookService bookService = new BookService();
		
		List<Book> listOfBook = bookService.listOfBook();
		
		for(Book b:listOfBook) {
			System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
		}
		
//		for(Book b:listOfBook) {
//			System.out.println(b.toString());
//		}
		
		listOfBook = bookService.findBookBetweenPrice(500d,1500.0d);
		
		for(Book b:listOfBook) {
			System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
		}
		
		listOfBook = bookService.findBookWrittenByAuthor("Paulo");
		
		for(Book b:listOfBook) {
			System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
		}

	}

}

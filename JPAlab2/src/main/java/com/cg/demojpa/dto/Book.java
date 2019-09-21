package com.cg.demojpa.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int bookIsbn;
	@Column(name="book_title")
	private String bookTitle;
	@Column(name="book_price")
	private double bookPrice;
	@ManyToMany(mappedBy = "bookList")
	private List<Author> authorList;
	
	public Book(int bookIsbn, String bookTitle, double bookPrice) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public Book() {
		super();
	}

	public int getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	@Override
	public String toString() {
		return "Book [bookIsbn=" + bookIsbn + ", bookTitle=" + bookTitle
				+ ", bookPrice=" + bookPrice + ", authorList=" + authorList
				+ "]";
	}
	
	
	
}

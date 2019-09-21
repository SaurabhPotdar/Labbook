package com.cg.lab2;

public class Book extends WrittenItem {
	
	public Book(int id, String title, int copies,String author) {
		super(id,title,copies,author);
	}

	@Override
	public void write() {
		System.out.println("Write method in Book class");
		
	}


}

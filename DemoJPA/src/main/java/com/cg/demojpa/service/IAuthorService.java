package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.exception.DemoJpaException;

public interface IAuthorService {
	
	public Author save(Author emp);
	public List<Author> findAll();
	public void remove(Integer authorId) throws DemoJpaException;
	public Author findById(Integer authorId);
	List<Author> findBetweenSalary(Double authorSalary1, Double authorSalary2);

}

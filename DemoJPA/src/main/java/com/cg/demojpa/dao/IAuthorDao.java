package com.cg.demojpa.dao;

import java.util.List;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.exception.DemoJpaException;

public interface IAuthorDao {
	
	public Author save(Author emp);
	public List<Author> findAll();
	public void remove(Integer empId) throws DemoJpaException;
	public Author findById(Integer empId);
	List<Author> findBetweenSalary(Double empSalary1, Double empSalary2);

}

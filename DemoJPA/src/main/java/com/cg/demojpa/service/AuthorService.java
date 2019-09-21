/**
 * 
 */
package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dao.AuthorDao;
import com.cg.demojpa.dao.IAuthorDao;
import com.cg.demojpa.dto.Author;
import com.cg.demojpa.exception.DemoJpaException;

/**
 * @author admin1
 *
 */
public class AuthorService implements IAuthorService {

	IAuthorDao authorDao = new AuthorDao();
	
	/* (non-Javadoc)
	 * @see com.cg.demojpa.service.IEmployeeService#save(com.cg.demojpa.dto.Employee)
	 */
	@Override
	public Author save(Author emp) {
		return authorDao.save(emp);
	}

	/* (non-Javadoc)
	 * @see com.cg.demojpa.service.IEmployeeService#findAll()
	 */
	@Override
	public List<Author> findAll() {
		return authorDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.cg.demojpa.service.IEmployeeService#remove(java.lang.Integer)
	 */
	@Override
	public void remove(Integer authorId) throws DemoJpaException {
		authorDao.remove(authorId);
	}

	@Override
	public Author findById(Integer authorId) {
		return authorDao.findById(authorId);
		
	}

	@Override
	public List<Author> findBetweenSalary(Double authorSalary1, Double authorSalary2) {
		return authorDao.findBetweenSalary(authorSalary1, authorSalary2);
	}

}

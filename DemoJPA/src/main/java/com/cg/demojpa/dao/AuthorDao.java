/**
 * 
 */
package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Author;
import com.cg.demojpa.exception.DemoJpaException;

/**
 * @author admin1
 *
 */
public class AuthorDao implements IAuthorDao {
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("DemoJPA");

	/* (non-Javadoc)
	 * @see com.cg.demojpa.dao.IEmployeeDao#save(com.cg.demojpa.dto.Employee)
	 */
	@Override
	public Author save(Author author) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(author);
		tran.commit();
		return author;
	}

	/* (non-Javadoc)
	 * @see com.cg.demojpa.dao.IEmployeeDao#findAll()
	 */
	@Override
	public List<Author> findAll() {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		Query query = em.createQuery("From Employee");
		List<Author> empList = query.getResultList();
//		List<Employee> empList = em.createQuery(
//		            "SELECT p FROM Employee p").getResultList();
		return empList;
	}

	/* (non-Javadoc)
	 * @see com.cg.demojpa.dao.IEmployeeDao#remove(java.lang.Integer)
	 */
	@Override
	public void remove(Integer authorId) throws DemoJpaException {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		Author author = em.find(Author.class, authorId);
		if(author!=null){
			tran.begin();
			em.remove(author);
			tran.commit();
		}
		else
			throw new DemoJpaException("Employee not found");
	}

	@Override
	public Author findById(Integer authorId){
		EntityManager em = entityFactory.createEntityManager();
		Author author = em.find(Author.class, authorId);
		return author;
	}
	
	@Override
	public List<Author> findBetweenSalary(Double authorSalary1, Double authorSalary2) {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Employee where emp_Salary BETWEEN :first AND :second");
		query.setParameter("first", authorSalary1);
		query.setParameter("second", authorSalary2);
		List<Author> authorList = query.getResultList();
		return authorList;
	}

}

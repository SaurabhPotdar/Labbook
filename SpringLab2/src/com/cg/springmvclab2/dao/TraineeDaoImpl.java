package com.cg.springmvclab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.springmvclab2.dto.Trainee;

public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Trainee find(int traineeId) {
		return entityManager.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAll() {
		Query query = entityManager.createQuery("From Trainee");
		List<Trainee> listTrainee = query.getResultList();
		return listTrainee;
	}

	@Override
	public void create(Trainee trainee) {
		entityManager.persist(trainee);
	}

	@Override
	public void delete(int id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		if(trainee!=null)
			entityManager.remove(trainee);
	}

	@Override
	public void modify(Trainee trainee) {
		entityManager.merge(trainee);
	}

}

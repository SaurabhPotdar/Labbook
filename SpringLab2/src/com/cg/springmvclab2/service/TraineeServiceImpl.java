package com.cg.springmvclab2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.springmvclab2.dao.TraineeDao;
import com.cg.springmvclab2.dto.Trainee;
import com.cg.springmvclab2.exception.MyException;

public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao traineeDao;
	
	@Override
	public Trainee find(int traineeId) throws MyException {
		Trainee trainee = traineeDao.find(traineeId);
		if(trainee!=null)
			return trainee;
		else
			throw new MyException("Trainee not found");
	}

	@Override
	public List<Trainee> getAll() {
		return traineeDao.getAll();
	}

	@Override
	public void create(Trainee trainee) {
		traineeDao.create(trainee);

	}

	@Override
	public void delete(int id) {
		traineeDao.delete(id);
	}

	@Override
	public void modify(Trainee trainee) {
		traineeDao.modify(trainee);
	}

}

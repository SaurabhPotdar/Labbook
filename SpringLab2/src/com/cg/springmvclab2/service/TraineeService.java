package com.cg.springmvclab2.service;

import java.util.List;

import com.cg.springmvclab2.dto.Trainee;
import com.cg.springmvclab2.exception.MyException;

public interface TraineeService {
	
	public Trainee find(int traineeId) throws MyException;
    
	public List<Trainee> getAll();
    
	public void create(Trainee trainee);
    
	public void delete(int id);
    
	public void modify(Trainee trainee);
    
}

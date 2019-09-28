package com.cg.springmvclab2.dao;

import java.util.List;

import com.cg.springmvclab2.dto.Trainee;

public interface TraineeDao {
	
public Trainee find(int traineeId);
    
	public List<Trainee> getAll();
    
	public void create(Trainee trainee);
    
	public void delete(int id);
    
	public void modify(Trainee trainee);

}

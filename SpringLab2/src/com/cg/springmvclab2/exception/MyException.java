package com.cg.springmvclab2.exception;

import com.cg.springmvclab2.dto.Trainee;

public class MyException extends Exception {
	
	private String message;

	public MyException(String message) {
		super(message);
	}

}

package com.cg.lab5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) throws EmployeeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = sc.nextInt();
		if(age<15)
			throw new EmployeeException("Age should be greater than 15");
		
	}

}

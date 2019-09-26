package com.cg.lab5.employee;

import java.util.Scanner;

import com.cg.lab5.EmployeeException;

public class Exercise6 {

	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		if(salary<3000)
			throw new EmployeeException("Salary should be greater than 3000");

	}

}

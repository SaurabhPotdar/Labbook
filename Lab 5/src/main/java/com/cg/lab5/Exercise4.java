package com.cg.lab5;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) throws EmployeeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String s1 = sc.nextLine();
		System.out.println("Enter last name");
		String s2 = sc.nextLine();
		if(s1.isBlank() && s2.isBlank())
			throw new EmployeeException("Blank name");
		
	}

}

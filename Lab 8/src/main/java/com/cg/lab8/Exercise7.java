package com.cg.lab8;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		System.out.println(validate(s));
		
	}
	
	public static boolean validate(String s) {
		String pattern = "^[A-Za-z0-9]{8,}_job$";
		return s.matches(pattern);
	}

}

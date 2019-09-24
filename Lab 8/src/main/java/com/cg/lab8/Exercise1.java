package com.cg.lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

//Exercise 1: Write a Java program that reads a line of integers and then displays each integer and
//the sum of all integers. (Use StringTokenizer class)?

public class Exercise1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a line of integers");
		String input = sc.nextLine();
		
		int sum=0;
		StringTokenizer token = new StringTokenizer(input, " "); 
	    while (token.hasMoreTokens()) { 
	    	int a = Integer.parseInt(token.nextToken());
	    	System.out.println(a);
	    	sum+=a;    
	    }
	    System.out.println("Sum is "+sum);
	    sc.close();
	}

}

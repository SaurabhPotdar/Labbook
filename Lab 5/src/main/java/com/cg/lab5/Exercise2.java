package com.cg.lab5;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		System.out.println("Nth value of fibonacci sequence using");
		System.out.println("Using recursion: "+fiboRecursion(n));
		System.out.println("Using iteration: "+fiboIterative(n));
	}

	private static int fiboIterative(int n) {
		int a = 0, b = 1, c, i; 
		if( n == 0) 
			return a; 
		for (i = 2; i <= n; i++) { 
			c = a + b; 
		    a = b; 
		    b = c; 
		} 
		  return b; 
	}

	private static int fiboRecursion(int n) {
		if(n<=1)
			return n;
		return fiboRecursion(n-1)+fiboRecursion(n-2);
	}

}

package com.cg.lab8;

import java.util.Scanner;

//Exercise 5: Create a method that accepts a String and checks if it is a positive string. A string is
//considered a positive string, if on moving from left to right each character in the String comes
//after the previous characters in the Alphabetical order. For Example: ANT is a positive String
//(Since T comes after N and N comes after A). The method should return true if the entered string
//is positive.

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		if(checkString(sc.next()))
			System.out.println("Positive String");
		else
			System.out.println("Negative String");
		sc.close();
	}
	
	public static boolean checkString(String input) {
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)>input.charAt(i+1))
				return false;
		}
		return true;
	}

}

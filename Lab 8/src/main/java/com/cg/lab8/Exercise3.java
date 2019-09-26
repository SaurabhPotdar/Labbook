package com.cg.lab8;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
            else if (s.charAt(i) == '.') {
                lineCount++;
                wordCount++;
            }
            else {
                ++charCount;
            }
        }
        System.out.println("Char Cont = " + charCount);
        System.out.println("Line Cont = " + lineCount);
        System.out.println("Word Cont = " + wordCount);
		
	}

}

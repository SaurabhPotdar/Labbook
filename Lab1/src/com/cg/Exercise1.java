package com.cg;

import java.util.*;

public class Exercise1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
		System.out.println(calculateDifference(n));
		System.out.println(checkNumber1(n));
		System.out.println(checkNumber2(n));
		
	}
	
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=3;i<=n;i++) {
			if(n%i==0 || n%5==0)
				sum+=i;
		}
		return sum;
	}
	
	public static int calculateDifference(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i*i-i;
		}
		return sum;
	}
	
	public static boolean checkNumber1(int n) {
		int digit1,digit2;
		digit1=n%10;
		n=n/10;
		while(n>0) {
			digit2=n%10;
			n=n/10;
			if(digit2>=digit1)
				return false;
		}
		return true;
	}
	
	public static boolean checkNumber2(int n) {
		if (n==0) 
            return false; 
        while(n!=1){ 
            if(n%2!=0) 
                return false; 
            n=n/2; 
        } 
        return true; 
	}
	
}

package com.cg.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(getSquares(array));
		sc.close();
	}
	
	public static Map<Integer,Integer> getSquares(int[] array) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], (int) Math.pow(array[i], 2));
		}
		return map;
	}

}

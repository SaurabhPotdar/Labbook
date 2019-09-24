package com.cg.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(countCharacter(str.toCharArray()));
		sc.close();

	}
	
	public static Map<Character,Integer> countCharacter(char[] charArray){
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<charArray.length;i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else
				map.put(charArray[i], 1);
		}
		return map;
	}

}

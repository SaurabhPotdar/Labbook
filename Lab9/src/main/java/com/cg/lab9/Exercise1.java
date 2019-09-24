package com.cg.lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	
	public static void main(String args[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 16);
		map.put(3, 14);
		map.put(4, 1);
		map.put(5, 100);
		map.put(6, 99);
		System.out.println(getValues(map));
		
	}
	
	public static List<Integer> getValues(Map<Integer, Integer> map){
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}

}

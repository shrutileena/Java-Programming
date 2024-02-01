package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProg {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// add value
		map.put("Shruti", 12);
		map.put("Abhay", 13);
		map.put("Smit", 14);

		System.out.println(map);
		
		// iterate
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		// fetch
		System.out.println(map.get("Abhay"));
		
		// key exists or not
		System.out.println(map.containsKey("shruti"));
		
		// value exists or not
		System.out.println(map.containsValue(40));
		
		// remove
		Integer removed = map.remove("Smit");	// returns key which is removed
		System.out.println(map);
		System.out.println(removed);
		
		// size
		System.out.println(map.size());
		
		// map is empty
		System.out.println(map.isEmpty());
	}

}

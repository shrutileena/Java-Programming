package com.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacters {

	public static void main(String[] args) {
		String str = "aabbccdef";
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<arr.length; i++) {
//			if(map.containsKey(arr[i])){
//				map.put(arr[i], map.get(arr[i])+1);
//			} else {
//				map.put(arr[i], 1);
//			}
			map.put(arr[i], map.containsKey(arr[i])? map.get(arr[i])+1 : 1);
		}
		
		for(Entry<Character, Integer> e: map.entrySet()) {
			if(e.getValue()==1) {
				System.out.print(e.getKey()+" ");
			} 
		}
	}

}

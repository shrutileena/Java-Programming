package com.example.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "sandeep";
		
		remove(str);
	}
	
	public static void remove(String s) {
		
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<s.length(); i++) {
			Character c = s.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}

}

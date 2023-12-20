package com.example.Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(32);
		numbers.add(43);
		numbers.add(16);
		numbers.add(10);
		numbers.add(11);
		Set<Integer> set = new HashSet<Integer>();
		
		numbers.stream().filter(x->!set.add(x))
		.forEach(System.out::println);
	}

}

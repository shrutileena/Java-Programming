package com.example.Streams;

import java.util.ArrayList;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(32);
		numbers.add(43);
		numbers.add(16);
		numbers.add(10);
		numbers.add(11);
		
		// findFirst
		numbers.stream().findFirst().ifPresent(System.out::println);
	}

}

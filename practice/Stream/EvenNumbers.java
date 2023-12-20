package com.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(11);
		
		System.out.println(numbers);
		
		System.out.println("Even Numbers: "+ numbers
				.stream().filter(x->x%2==0).collect(Collectors.toList()));
		
		// or
		numbers.stream().filter(x->x%2==0).forEach(System.out::println);
		
	}

}

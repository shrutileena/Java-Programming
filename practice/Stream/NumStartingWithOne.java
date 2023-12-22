package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(32);
		numbers.add(43);
		numbers.add(16);
		numbers.add(17);
		numbers.add(11);
		
		numbers.stream().map(x-> x.toString()).
		filter(y->y.startsWith("1")).forEach(System.out::println);
		
		numbers.stream().map(x-> x.toString()).
		filter(y->y.startsWith("1")).forEach(y->System.out.print(y+" "));
		
		System.out.println();
		
		System.out.println(numbers.stream()
				.filter(x->x.toString().startsWith("1")).collect(Collectors.toList()));

	}

}

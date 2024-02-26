package com.example.streams;

import java.util.Arrays;
import java.util.List;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count the number of occurences of a specific element in a list using java8 features
		// input = "apple", "banana", "apple", "orange", "apple"
		// count occurences of "apple" word in the given list
		// output - 3
		
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "apple");
		Long count = fruits.stream().filter(x->x.equals("apple")).count();
		System.out.println(count);
	}

}

package com.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create stream
		Stream<String> sstream;
		Stream<Integer> istream;
		
		// intermediate operations
		// map
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(number);
		System.out.println(numbers);
		
		List<Integer> squares = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squares);
		
		// filter
		List<String> names = Arrays.asList("Shruti", "Abhay", "Jay", "Yudi", "Shreya");
		List<String> filteredNames = names.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
		System.out.println(filteredNames);
		
		// sort
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		// terminal operations
		// collect
		// forEach
		number.stream().map(x->x*x*x).forEach(y->System.out.print(y+" "));
		number.stream().forEach(x->{System.out.println(x*x*x+" ");});
		
		// reduce
		Integer evenNumbers = number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of even numbers: "+evenNumbers);
		
	}

}

package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndAdd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		System.out.println(list.stream().filter(x -> x % 2 == 0).reduce(0, (s, x) -> s + x));
		System.out.println(list.stream()
				.collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.summingInt(Integer::intValue))));
	}

}

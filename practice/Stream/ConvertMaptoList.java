package com.example.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ConvertMaptoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		List<Integer> list = new ArrayList<Integer>();
		map1.put(1, 2);
		map1.put(3, 4);
		map1.put(5, 6);
		List<Integer> resultSortedKey = new ArrayList<Integer>();
		
		list = map1.keySet().stream().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(map1.values().stream().collect(Collectors.toList()));
		
		// using sorted
		map1.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByKey())
		.peek(x -> resultSortedKey.add(x.getKey())).map(x -> x.getValue())
		.forEach(System.out::print);
		
		System.out.println();
		
		resultSortedKey.forEach(System.out::print);
		
	}

}

package com.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstProg {

	public static void main(String[] args) {

		// list
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		// set
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		// removing value at index from list
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getClass().getPackage());
		System.out.println(list.getClass().getConstructors());
	}

}

package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProg {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		// add duplicate
		set.add(50);

		System.out.println(set);

		// check element in set
		System.out.println(set.contains(10));
		System.out.println(set.contains(60));

		// remove element
		boolean isRemoved = set.remove(20);

		System.out.println("Is Removed ? " + isRemoved);
		System.out.println(set);

		// iterate set
		for(Integer s: set) {
			System.out.println(s);
		}
		
	 	Iterator<Integer> it = set.iterator();
	 	while(it.hasNext()) {
	 		Integer val = it.next();
	 		System.out.println(val);
	 	}
	 	
	 	// check empty
	 	System.out.println(set.isEmpty());
	 	
	 	// clear the set
	 	set.clear();
	 	System.out.println(set);
	 	
	 	// check empty
	 	System.out.println(set.isEmpty());
	}

}

package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversalExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("shruti");
		System.out.println(al);
		
		// for each loop
		for(String a: al) {
			System.out.println(a);
		}
		
		System.out.println("-------------------");
		
		// Iterator - forward traversing
		Iterator<String> iterator = al.iterator();	// Iterator object
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

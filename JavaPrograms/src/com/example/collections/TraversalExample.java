package com.example.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class TraversalExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("shruti");
		al.add("abc");
		System.out.println(al);

		Vector<String> vector = new Vector<String>();
		vector.addAll(al);

		// for each loop
		for (String a : al) {
			System.out.println(a);
		}

		System.out.println("-------------------");

		// Iterator - forward traversing
		Iterator<String> iterator = al.iterator(); // Iterator object
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("-------------------");

		// ListIterator - backward traversing also possible here + forward
		ListIterator<String> listIterator = al.listIterator(al.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// forEach method
		System.out.println("-------------------");
		al.forEach(e -> {
			System.out.println(e);
		});

		// Enumeration
		System.out.println("-------------------");
		Enumeration<String> ele = vector.elements();
		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}

		// sorted elements - use TreeSet
		System.out.println("-------------------");
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(al);
		ts.forEach(e -> System.out.println(e));

		// map
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Core Java", 1000);
		map.put("Python", 2000);
		
		System.out.println("-------------------");
		map.forEach((x,y)->System.out.println(x + "->" + y));
	}

}

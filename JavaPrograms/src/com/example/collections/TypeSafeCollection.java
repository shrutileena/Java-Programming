package com.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class TypeSafeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
//		al.add(123);	// cannot add int value in string collection
		al.add("Hi");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.add("Hi");
		al.set(1, "shruti");	// replaces value at index 1
		System.out.println(al);
		
		al.add(1, "Hi");	// adds and shifts value at index 1
		System.out.println(al);
		
//		al.clear();
//		System.out.println(al);
		
		Vector<String> vector = new Vector<String>();
		vector.addAll(al);
		System.out.println(vector);
		
		System.out.println("----------------------");
		
		HashSet<Double> hs = new HashSet<Double>();
		hs.add(14.14);
		hs.add(34.3865);
		hs.add(1.286);	// no order
		System.out.println(hs);
		
		TreeSet<Double> ts = new TreeSet<Double>();
		ts.addAll(hs);	// sorted set
		System.out.println(ts);
	}

}

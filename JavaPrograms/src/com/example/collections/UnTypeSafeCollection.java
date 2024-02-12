package com.example.collections;

import java.util.LinkedList;

public class UnTypeSafeCollection {

	public static void main(String[] args) {
		
		LinkedList<Comparable> linkedlist = new LinkedList();
		linkedlist.add("shruti");
		linkedlist.add(102);
		System.out.println(linkedlist);
		
	}
}

package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {

	T container;

	public Generic(T container) {
		this.container = container;
	}

	public T getValue() {
		return this.container;
	}

	public void performSomeTask() {
		if (container instanceof String) {
			System.out.println("length of " + container + "is " + (((String) this.container).length()));
		} else if (container instanceof Integer) {
			System.out.println("This is the integer value " + container);
		} else if(container instanceof Double) {
			System.out.println("This is the double value " + container);
		}
	}

	public static void main(String[] args) {

		// Generic
		// Type Safe
		List<String> list = new ArrayList<String>();
		list.add(null);

		// Not Generic
		// Not Type Safe
		List list2 = new ArrayList();
		list2.add("shruti");
		list2.add(123);
		list2.add(true);
		list2.add(null);

		Generic<Double> generic = new Generic<Double>(102.0);
		System.out.println(generic.getValue());
		System.out.println(generic.container.getClass().getName());
		generic.performSomeTask();

		Generic<Integer> generic2 = new Generic<Integer>(102);
		System.out.println(generic2.getValue());
		System.out.println(generic2.container.getClass().getName());
		generic2.performSomeTask();

	}
}

package com.example;

import java.util.Arrays;

enum Status {

	Running, Failed, Pending, Success;
	// 0,1,2,3
	// the above constants get number associated like 0 for Running and so on
	// it called ordinal
	
	// enum can have constructor
	// enum extends Enum class by default
}

public class Enum {

	public static void main(String[] args) {

		// Enum - class
		// It cannot extend any other class
		// Enum -> named constants or specific constants we want to use
		// Enum - type, so Status is a type here
		// inside it -> objects
		// So, Running, Failed, Pending, Success are objects

		Status s = Status.Running; // Object Running is assigned to s

		System.out.println(s);
		System.out.println(s.ordinal());

		Status[] arr = Status.values();
		System.out.println(Arrays.toString(arr));

		for (Status st : arr) {
			System.out.println(st + "->" + st.ordinal());
		}

		// we can compare Enum constants
		Status s2 = Status.Success;

		if (s2 == Status.Running) {
			System.out.println("All good");
		} else if (s2 == Status.Failed) {
			System.out.println("Try Again");
		} else if (s2 == Status.Pending) {
			System.out.println("Please wait");
		} else {
			System.out.println("Done");
		}

		// switch supports enum
		switch (s2) {
		case Running:
			System.out.println("All good");
			break;
		case Failed:
			System.out.println("Try Again");
			break;
		case Pending:
			System.out.println("Please wait");
			break;
		case Success:
			System.out.println("Done");
			break;
		}
		
		System.out.println();
		System.out.println(s.getClass().getSuperclass());
	}

}

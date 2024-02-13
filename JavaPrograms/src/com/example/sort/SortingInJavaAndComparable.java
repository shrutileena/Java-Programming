package com.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInJavaAndComparable {

	public static void main(String[] args) {

		int[] arr = { 11, 5, 6, 120, 8, 9 };

		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

		// sort - Arrays
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("----------------");

		int[] arr1 = { 11, 5, 6, 120, 8, 9 };

		List<Integer> list = new ArrayList<Integer>(Arrays.stream(arr1).boxed().toList());
		System.out.println(list);

		// sort - Collections
		Collections.sort(list);
		System.out.println(list);

		System.out.println();
		System.out.println("----------------");

		List<Student> students = new ArrayList<Student>();
		students.add(new Student(0, "shruti", 24));
		students.add(new Student(10, "akshay", 25));
		students.add(new Student(1, "abhay", 25));
		System.out.println(students);

//		Collections.sort(students);	// This is not possible if Comparable is not used

		// Comparable
		Collections.sort(students);
		System.out.println(students);

	}

}

class Student implements Comparable<Student> {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
//		return this.id-o.id;	// int values
		return this.name.compareTo(o.name); // string values
	}
}
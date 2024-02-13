package com.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInJavaComparator {

	public static void main(String[] args) {
		List<Student1> students = new ArrayList<Student1>();
		students.add(new Student1(0, "shruti", 24));
		students.add(new Student1(10, "akshay", 25));
		students.add(new Student1(1, "abhay", 25));
		System.out.println(students);
		Collections.sort(students, new IdComparator());
		System.out.println(students);
		
		Collections.sort(students, new NameComparator());
		System.out.println(students);
	}

}

class Student1 {
	int id;
	String name;
	int age;

	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

class IdComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.id - o2.id;
	}
	
}

class NameComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
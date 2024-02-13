package com.example.sort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingTreeset {

	public static void main(String[] args) {
		Set<Student2> students = new TreeSet<Student2>(new IdComparator2());
		students.add(new Student2(0, "shruti", 24));
		students.add(new Student2(10, "akshay", 25));
		students.add(new Student2(1, "abhay", 25));
		
		System.out.println(students);
		
	}

}

class Student2 {
	int id;
	String name;
	int age;

	public Student2(int id, String name, int age) {
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

class IdComparator2 implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.id - o2.id;
	}
	
}

class NameComparator2 implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
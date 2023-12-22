package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getRollNo() - s2.getRollNo();
	}
	
}

class SortByName implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s1.getName()) ;
	}
}

public class SortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(111, "Shruti", "Gzb"));
		listOfStudents.add(new Student(141, "Rishi", "Gzb"));
		listOfStudents.add(new Student(131, "Abhay", "Gzb"));
		
		System.out.println("Unsorted");
		for(Student s: listOfStudents) {
			System.out.println(s.toString());
		}
		
		System.out.println("Sorted by Name");
		Collections.sort(listOfStudents, Collections.reverseOrder(new SortByName()));
		for(Student s: listOfStudents) {
			System.out.println(s);
		}
		
		System.out.println("Sorted by Roll No");
		Collections.sort(listOfStudents, new SortByRollNo());
		for(Student s: listOfStudents) {
			System.out.println(s);
		}
		

	}

}

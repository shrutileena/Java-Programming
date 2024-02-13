package com.example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Deserialization
		FileInputStream fileInputStream = new FileInputStream("newFile.txt");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Student student = (Student) objectInputStream.readObject();
		
		student.displayName();
		
		objectInputStream.close();
		fileInputStream.close();
		
		System.out.println(student.getAddress());
		System.out.println(student.getAge());
		System.out.println(student.getEmail());
	}

}

package com.example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		// Serialization 
		
		Student student = new Student("Shruti", "shruti@gmail.com", 24, "Pune");
		
		// write data to file
		FileOutputStream fileOutputStream = new FileOutputStream("newFile.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		// how to serialize
		objectOutputStream.writeObject(student);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Object state is transfered to file.");
	}

}
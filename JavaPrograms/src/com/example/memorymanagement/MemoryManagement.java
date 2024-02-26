package com.example.memorymanagement;

public class MemoryManagement {

	public static void main(String[] args) {

		int primitiveVariable = 10; // main method stack
		Person personObj = new Person();
		String stringLiteral = "24";
		MemoryManagement memObj = new MemoryManagement();
		memObj.memoryManagement(personObj);

//		main method stack
//		memObj (reference of MemoryManagement object)
//		stringLiteral = "literal" (reference of String object)
//		personObj (reference of Person object)
//		primitiveVariable = 10
		
//		memoryManagement method stack
//		personObj (reference of Person object)
//		personObj2 (pointing to personObj object in heap)
//		stringLiteral2 (reference to 24 in string pool)
//		stringLiteral3 (reference to string object)

//		heap memory
//		Person Object (which has class, instance variable and methods)
//		String Pool (24)
//		MemoryManagement Object (which has class, instance variable and methods)
//		String object (created using new)

	}

	private void memoryManagement(Person personObj) {
		Person personObj2 = personObj;
		String stringLiteral2 = "24";
		String stringLiteral3 = new String("24");
	}
}

class Person {

}
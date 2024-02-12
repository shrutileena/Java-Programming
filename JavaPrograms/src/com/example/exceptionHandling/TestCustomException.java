package com.example.exceptionHandling;

class CustomException extends Exception{
	
	public CustomException(String str) {
		super(str);
	}
	
}

public class TestCustomException extends Exception {

	public static void validate(int age) throws CustomException {
		if(age < 18) {
			throw new CustomException("Age must be greater than or equal to 18");
		} else {
			System.out.println("Eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(16);
		} catch (CustomException e) {
			System.out.println("Exception caught");
			System.out.println("Exception : " + e);
		}
		System.out.println("Rest of the code");
	}
	
}

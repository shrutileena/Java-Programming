package com.example.exceptionHandling;

public class AgeInvalidException extends Exception {

	public AgeInvalidException() {
		super("Age is Invalid");
	}
	
	public AgeInvalidException(String str){
		super(str);
	}

}

package com.example.java.questions2;

public class Question {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[6] = 30/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch(Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("Finally 1");
			System.out.println("FInally 2");
		} 

	}

}

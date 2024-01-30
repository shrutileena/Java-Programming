package com.example.java.questions1;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		
		System.out.println("Sum of odd numbers between 1 and 50 is = " + calcSum());
	}
	
	public static int calcSum() {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}

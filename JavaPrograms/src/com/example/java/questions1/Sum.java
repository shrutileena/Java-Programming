package com.example.java.questions1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter initial number: ");
		int i = sc.nextInt();
		
		System.out.println("Enter last number: ");
		int j = sc.nextInt();
		
		int sum = calcSum(i, j);
		
		System.out.println("Sum is = " + sum);
	}
	
	public static int calcSum(int i, int l) {
		int s = 0;
		while(i<=l) {
			s += i;
			i++;
		}
		return s;
	}
}

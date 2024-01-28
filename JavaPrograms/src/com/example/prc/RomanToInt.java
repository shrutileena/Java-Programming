package com.example.prc;

import java.util.Scanner;

public class RomanToInt {

	public static int rCharToInt(char c) {
		
		switch (c) { 

		case 'I': return 1; 
		case 'V': return 5; 
		case 'X': return 10; 
		case 'L': return 50; 
		case 'C': return 100; 
		case 'D': return 500; 
		case 'M': return 1000; 
		
		}
		return 0; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Roman Numeral: ");
		String roman = new String(input.nextLine());
		
		char[] romanArr = roman.toCharArray();
		int len = romanArr.length;
		int num = 0;
		
		
		for(int i=0; i<len; i++) {
			int n1 = rCharToInt(romanArr[i]);
			int n2 = 0;
			if(i+1 < len) {
				 n2 = rCharToInt(romanArr[i+1]);
				 if(n1 >= n2) {
						num = num + n1;
					} else {
						num = num - n1;
					}
			} else {
				num = num + n1;
			}
			
			
			
		}
		
		System.out.println("Integer value to given roman numeral is: "+num);
		// LX = 60
		// L =50, X = 10
		// CIX = 109
		// C=100, I=1, X = 10 ; IX = 10-1
		// XLIX = (50-10)+10-1
	}

}

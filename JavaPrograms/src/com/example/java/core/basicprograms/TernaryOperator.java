package com.example.java.core.basicprograms;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=35, b=6, c=34;
		int res = (a>b) ? (c>b) ? c : b : (c>a) ? c : a ;
		// condition - (a>b)
		// (c>b) ? c : b - true part
		// (c>a) ? c : a - false part
		System.out.println(res);
		
	}
}

package com.example.java.core.basicprograms;

public class LanguageFundamentalsTest {

	public static void main(String[] args) {

		int a = 6;
		int b = ++a * 2 + a++ + --a - a--;
		
		System.out.println(b);

		int x = 6;
		int y = x-- + --x + x++ - ++x;
		System.out.println(y);
		
		int q = 3;
		int q1 = q-- + q++ - --q * ++q + q--;
		System.out.println(q1);
		
		int m = 10;
		int n = m-- * --m * m++ - m-- * m++;
		System.out.println(n+" "+m);
		
		int g = 4;
		int g1 = g-- / ++g * --g + g++ * g-- - --g / g++;
		System.out.println(g1+" "+g);
	}
}

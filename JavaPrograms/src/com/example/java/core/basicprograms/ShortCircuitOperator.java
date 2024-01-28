package com.example.java.core.basicprograms;

public class ShortCircuitOperator {

	public static void main(String[] args) {

		// &&
		int x = 30, y = 20;

		if (++x < 30 && ++y < 20) { // && checks left condition i.e., x ; It is false so it does not check y
			x++;
		}

		System.out.println(x + " " + y);

		// &
		int a = 30, b = 20;

		if (++a < 30 & ++b < 20) { // & checks both a and b
			a++;
		}

		System.out.println(a + " " + b);

		// ||
		int x1 = 30, y1 = 20;

		if (++x1 > 30 || ++y1 < 20) { // || checks left condition i.e., x1 ; It is true so it does not check y
			x1++;
		}

		System.out.println(x1 + " " + y1);

		// |
		int x2 = 30, y2 = 20;

		if (++x2 > 30 | ++y2 < 20) { // | checks left and right condition
			x2++;
		}

		System.out.println(x2 + " " + y2);
	}
}

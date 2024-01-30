package com.example.java.core.basicprograms;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String result = null;

		if (n > 10) {
			System.out.println("Invalid Input");
		} else {
			switch (n) {
			case 1:
				result = "I";
				break;
			case 2:
				result = "II";
				break;
			case 3:
				result = "III";
				break;
			case 4:
				result = "IV";
				break;
			case 5:
				result = "V";
				break;
			case 6:
				result = "VI";
				break;
			case 7:
				result = "VII";
				break;
			case 8:
				result = "VIII";
				break;
			case 9:
				result = "IX";
				break;
			case 10:
				result = "X";
				break;
			}
			System.out.println("The roman numeral of your input (" + n + ") is = " + result);
		}
	}
}

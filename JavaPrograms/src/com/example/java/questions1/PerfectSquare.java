package com.example.java.questions1;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isPerfectSquare = checkPerfectSquare(n);

		System.err.println(isPerfectSquare);
		sc.close();
	}

	public static boolean checkPerfectSquare(int n) {
		boolean isPerfectSquare = false;
		for (int i = 1; i <= n / 2; i++) {
			int x = i * i;
			if (x == n) {
				isPerfectSquare = true;
				break;
			} else {
				isPerfectSquare = false;
			}
		}
		return isPerfectSquare;
	}
}

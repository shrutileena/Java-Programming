package com.example.sort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 55, 22, -9 };
//		int[] arr = { -1, 0, 2, 22, 55 };

		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr) {

		LocalDateTime l1 = LocalDateTime.now();

		boolean swapped = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					swapped = true;
				}
			}
			if(swapped==false) {
				break;
			}
		}

		LocalDateTime l2 = LocalDateTime.now();
		Duration d = Duration.between(l1, l2);
		System.out.println("Time taken by Bubble Sort - " + d.toMillis()); // 1 mili second
	}

}

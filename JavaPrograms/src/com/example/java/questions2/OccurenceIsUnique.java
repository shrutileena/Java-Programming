package com.example.java.questions2;

import java.util.HashMap;
import java.util.Map;

public class OccurenceIsUnique extends Thread {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
//		int[] arr = {1,2,3,4};
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int[] a = new int[arr.length];
		int j = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			a[j] = e.getValue();
			j++;
		}

		boolean isUnique = true;

		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				isUnique = false;
				break;
			} else {
				isUnique = true;
			}
		}

		if (!isUnique) {
			System.out.println("Occurence is not unique");
		} else {
			System.out.println("Occurence is unique");
		}
	}
}

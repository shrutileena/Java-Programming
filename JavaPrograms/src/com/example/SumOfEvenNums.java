package com.example;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find sum of  all the even numbers from the given array using javas features
		// 1,2,3,4,5,6,7,8,9,10
		// output - 30
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = num.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}

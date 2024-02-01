package com.example.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListCapacity {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int initialCapacity = getArrayListCapacity(numbers);
		
		System.out.println("Initial Capacity : " + initialCapacity);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		int currentCapacity = getArrayListCapacity(numbers);
		
		System.out.println("Initial Capacity : " + currentCapacity);

	}

	private static int getArrayListCapacity(ArrayList<?> numbers) {
		try {
			Field elementDataField = ArrayList.class.getDeclaredField("elementData");
			elementDataField.setAccessible(true);
			Object[] elementData = (Object[]) elementDataField.get(numbers);
			return elementData.length;
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
			return -1;
		}
	}

}

class A{
	
}

package com.example.hashmap.working;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		HashMap<String, Integer> friends = new HashMap<String, Integer>();
		friends.put("Ankit", 20); // debug and open variables view and look at variables
		friends.put("Uttam", 25); // after step over - threshold(12), size(1), table(index 14 has the object
									// stored)
		// after step over - threshold(12), size(2), table(index 5 has the object
		// stored)

		friends.put("Uttam", 26); // here key is same so value is replaced
		friends.put(null, null); // here it is stored at index 0 in table and size is 3 of the table
		System.out.println(friends);
	}

}

package com.example.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shruti Agarwal";
		char[] nameArray = name.toCharArray();
		int size = nameArray.length;
		char[] reversedArray = new char[size];
		int j=0;
		
		for(int i=size-1; i>=0; i--) {
			reversedArray[j]=nameArray[i];
					j++;
		}
		
		System.out.println(new String(reversedArray));
		
		StringBuffer bf = new StringBuffer("Shruti");
		System.out.println(bf.reverse());
		
		StringBuilder sb = new StringBuilder("Shruti");
		System.out.println(sb.reverse());
		
//		ArrayList<Character> charArr = new ArrayList<Character>();
//		for(char c: nameArray) {
//			charArr.add(c);
//		}
	}

}

package com.example;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "StaticClass Agarwal";
		char[] nameArray = name.toCharArray();
		int size = nameArray.length;
		char[] reversedArray = new char[size];
		int j=0;
		
		for(int i=size-1; i>=0; i--) {
			reversedArray[j]=nameArray[i];
					j++;
		}
		
		System.out.println(new String(reversedArray));
		StringBuffer bf = new StringBuffer("StaticClass");
		System.out.println(bf.reverse());
		
		StringBuilder sb = new StringBuilder("StaticClass");
		System.out.println(sb.reverse());
		
//		ArrayList<Character> charArr = new ArrayList<Character>();
//		for(char c: nameArray) {
//			charArr.add(c);
//		}
	}

}

package com.example.strings;

public class MutableString {

	public static void main(String[] args) {
		// We use String Buffer, String Builder
		StringBuffer sb = new StringBuffer();
		// sb gives u buffer size - 16 bytes
		System.out.println(sb.capacity());
		
		sb = new StringBuffer("Shruti");
		System.out.println(sb.capacity());	// capacity is changed
		
		// it gives capacity because we need continuous location in heap
		// and what if we dont get it. So we will have to relocate string in that case
		// So, to reduce relocation it has some buffer
		
		// we can append data in sb
		System.out.println(sb);
		sb.append(" agarwal");
		System.out.println(sb);
		
		// to convert to string we use toString()
		String str = sb.toString();
		
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		sb.insert(3, "Java");
		System.out.println(sb);
		
		System.out.println(sb.substring(3, 6));
		
		sb.setLength(30);
		System.out.println(sb.length());
		System.out.println(sb);
		
		sb.ensureCapacity(100);	// minimum capacity
		
		// String Buffer is Thread safe
		// String Builder is not
		
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());	// capacity is 16
		
		s.append("shruti");
		System.out.println(s);
		s.append(" agarwal");
		System.out.println(s);
		
		String str2 = s.toString();
		System.out.println(str2);
	}

}

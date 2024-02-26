package com.example.strings;

public class EqualsAndDoubleEqual {

	public static void main(String[] args) {
		
		String s1 = "shruti";
		String s2 = "shruti";
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = new String("shruti");
		System.out.println(s1==s3);	// reference is different
		System.out.println(s1.equals(s3));
		
		StringBuffer sb = new StringBuffer("shruti");
		System.out.println(s1==sb.toString());
		System.out.println(s1.equals(sb.toString()));
		
		StringBuilder sb2 = new StringBuilder("shruti");
		System.out.println(s1==sb2.toString());
		System.out.println(s1.equals(sb2.toString()));
	}
}

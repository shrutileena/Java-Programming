package com.example.java.core.basicprograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "my name is shruti";
		
		String[] words = s.split(" ");
		
		for(int i=words.length-1; i>=0; i--) {
			System.out.print(words[i] + " ");
		}
	}
	
}

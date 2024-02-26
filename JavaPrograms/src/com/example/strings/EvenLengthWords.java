package com.example.strings;

public class EvenLengthWords {

	public static void main(String[] args) {
		String str = "Hello Worl";
		
		String[] words = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length()%2==0) {
				System.out.println(words[i]+"->"+words[i].length());
			}
		}
	}

}

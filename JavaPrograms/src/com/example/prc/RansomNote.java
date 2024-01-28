package com.example.prc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Note: ");
		StringBuffer note = new StringBuffer(input.nextLine());
		System.out.println("Magazine: ");
		StringBuffer magazine = new StringBuffer(input.nextLine());
		
		char[] noteArr = note.toString().toCharArray();
		char[] magArr = magazine.toString().toCharArray();
		Map<Character, Integer> magMap = new HashMap<Character, Integer>();
		Map<Character, Integer> noteMap = new HashMap<Character, Integer>();
		
		boolean isConstructed = true;
		
		for(int i=0; i<magArr.length; i++) {
			if(magMap.containsKey(magArr[i])) {
				magMap.put(magArr[i], magMap.get(magArr[i])+1);
			}
			else {
				magMap.put(magArr[i], 1);
			}
		}
		
		for(int i=0; i<noteArr.length; i++) {
			if(noteMap.containsKey(noteArr[i])) {
				noteMap.put(noteArr[i], noteMap.get(noteArr[i])+1);
			}
			else {
				noteMap.put(noteArr[i], 1);
			}
		}
		for(int i = 0; i<noteArr.length; i++) {
			if((magMap.containsKey(noteArr[i])) && (noteMap.get(noteArr[i]) > magMap.get(noteArr[i]))) {
				isConstructed = false;
			}
		}
		
		System.out.println(isConstructed);
	}

}

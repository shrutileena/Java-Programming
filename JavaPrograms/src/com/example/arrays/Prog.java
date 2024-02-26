package com.example.arrays;

public class Prog {

	public static void main(String[] args) {
//		[2, 3, 4, 5, 7, 8, 10, 11, 12, 15, 16, 20, 21, 22, 24]
//				2-5, 7, 8, 10-12, 15, 16, 20-22, 24
		int[] arr = {2, 3, 4, 5, 7, 8, 10, 11, 12, 15, 16, 20, 21, 22,  24};
		String str = pageRange(arr);
		System.out.println(str);
	}
	
	public static String pageRange(int[] arr) {
		int len = arr.length;
		int j = 0, k = 0;
		StringBuffer s = new StringBuffer();
		j = arr[0];
		
		for(int i=1; i<len; i++) {
			
			if((arr[i]) == (arr[i-1]+1)) {
				k = arr[i];
			} else {
				s.append(j +"-"+k+",");
				j = arr[i]; 
			}
			
			
		}
		if(j<k) {
			s.append(j +"-"+k);
		} else {
			s.append(j);
		}
		
		return s.toString();
	}

}

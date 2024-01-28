package com.example.prc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using core java how would you convert an InputStream to String
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(0);
		lst.add(1);
		lst.add(2);
		Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
		lst.stream().forEach(x-> mp.put(x,x));
		
		System.out.println(mp);
	}

}

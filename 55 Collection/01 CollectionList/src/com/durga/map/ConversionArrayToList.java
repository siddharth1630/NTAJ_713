package com.durga.map;

import java.util.Arrays;
import java.util.List;

public class ConversionArrayToList {
	public static void main(String[] args) {
		String[] s= {"a","z","b"};
		List l=Arrays.asList(s);
		for(String s1:s)
			System.out.println(s1);
		System.out.println(l);
		
	//	l.add(23);	//we can't add becz array size is fixed
	//	l.add("asfw");// same
	//	l.remove(1);// same
		l.set(2, "siddharht");
	//	l.set(1, new Integer(23));// we can't add hetrogenous object to aarrya so RE
		System.out.println();
		for(String s1:s)
			System.out.println(s1);
		System.out.println(l);
		
	}
}

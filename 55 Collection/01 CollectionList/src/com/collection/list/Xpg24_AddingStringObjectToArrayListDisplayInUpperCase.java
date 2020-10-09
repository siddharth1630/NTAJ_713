package com.collection.list;

import java.util.ArrayList;

public class Xpg24_AddingStringObjectToArrayListDisplayInUpperCase {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("sid");
		al.add("vivek");
		al.add("raj");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			String str=(String)al.get(i);
			System.out.println(str);
			System.out.println(str.toUpperCase());
			System.out.println();
		}
	}
}

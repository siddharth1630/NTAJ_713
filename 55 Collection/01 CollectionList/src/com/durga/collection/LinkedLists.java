package com.durga.collection;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add(23.23);
		l.add(new String("ss"));
		l.add(new StringBuffer("sid"));
		System.out.println(l);
		System.out.println();
		
		l.add(null);
		l.set(3, "gupta");
	//	l.removeLast();
	//	l.removeLast();
		l.addFirst("hari OM");
		System.out.println(l);
	}
}

package com.durga.collection;

import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
		hs.add("sid");
		hs.add("gutpa");
		hs.add("raj");
	//	hs.add(32);
	//	hs.add(234.23);
	//	hs.add(new StringBuffer("sid"));
	//	hs.add(null);
	//	hs.add(null);
		hs.add("sid");
	
		
		hs.add(new String("siddd"));
	//	hs.add(new StringBuffer("a"));	// not allowed becz it is not implements from comparable
		System.out.println(hs);
	}
}

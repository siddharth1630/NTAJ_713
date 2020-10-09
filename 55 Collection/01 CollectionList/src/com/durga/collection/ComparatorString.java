package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorString {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparators());
		t.add("sid");
		t.add("aman");
		t.add("jitin");
		t.add("teja");
		t.add("sid");
	//	t.add(null);
		t.add(null);
		
		System.out.println(t);
		
	}
}
class MyComparators implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=obj2.toString();
		
	//	return s2.compareTo(s1);		// descending
	//	return -s2.compareTo(s1);		//ascending
	//	return s1.compareTo(s2);		//ascending
	//	return -s1.compareTo(s2);		// descindign
	//	return -1;						// revese insertion
		return 1;						// insertion order
	//	return 0;			// only first elemtn
		
	}
	
}

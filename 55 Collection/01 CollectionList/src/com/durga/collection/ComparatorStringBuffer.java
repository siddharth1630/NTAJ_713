package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorStringBuffer {
	public static void main(String[] args) {
		TreeSet t=new TreeSet<>(new MyComparatorSB());
		t.add(new StringBuffer("sid"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("G"));
		t.add(new StringBuffer("E"));
		
		System.out.println(t);
	}
}

class MyComparatorSB implements Comparator{		// becz of this SB will not raise CCE

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
	
}

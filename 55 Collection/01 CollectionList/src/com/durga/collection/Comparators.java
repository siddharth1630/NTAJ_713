package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparators {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());	
		t.add(10);
		t.add(0);
		t.add(10);
		t.add(15);
		t.add(20);
		System.out.println(t);
	}
}

class MyComparator implements Comparator{	

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		// for descending order
	/*	if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else 
			return 0;	*/
		
		// for ascending
	//	return i1.compareTo(i2);
		
		// for descending order
	//	return -i1.compareTo(i2);
		
		// fpr descending
	//	return i2.compareTo(i1);
		
		// for ascending
	//	return -i2.compareTo(i1);
		
		//for insertion  order
	//	return 1;
		
		// reverse insertion order
	//	return -1;
		
		// duplicaiton is not allowed 
		return 0;	// so all the number is duplicate becz we return 0 means duplicaiton . ONLY first element will enter
	}	
}



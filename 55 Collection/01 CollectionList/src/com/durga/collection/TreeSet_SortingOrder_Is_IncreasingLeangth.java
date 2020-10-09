// insert string & string buffer object into treeset where sorting order is increasig length order.
// if length is same then sort by alphabetically order

package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_SortingOrder_Is_IncreasingLeangth {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("sid");
	//	t.add(new StringBuffer("gupta"));
		t.add("babu");
		t.add("saheb");
		System.out.println(t);	
		System.out.println();
		
		System.out.println("Customized sording order");
		TreeSet t1=new TreeSet(new SortingComparator());
		t1.add("sid");
		t1.add(new StringBuffer("gupta"));
		t1.add("babu");
		t1.add("saheb");
		System.out.println(t1);	
	}
}

class SortingComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1>l2)
			return 1;
		else if(l2>l1)
			return -1;
		else
			return s1.compareTo(s2);
	}	
}

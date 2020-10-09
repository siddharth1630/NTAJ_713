package com.durga.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SearchingElementOfList {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("sid");
		l.add("afds");
	//	l.add(232);	// for Collections.sort is not allowed to hetrogenewos object
	//	l.add(null);// not allowed null
		l.add("fish");
		l.add("dish");
		l.add("zero");
		
		System.out.println("beforre sorting "+ l);
		Collections.sort(l);
		System.out.println("after sorting "+l);
		System.out.println();
		System.out.println(Collections.binarySearch(l,"dish"));//1
		System.out.println(Collections.binarySearch(l,"fish"));//2
		System.out.println(Collections.binarySearch(l,"kitchen"));//-4
		System.out.println();
		
		ArrayList l1=new ArrayList();
		l1.add(1);
		l1.add(2323);
		l1.add(123);	// for Collections.sort is not allowed to hetrogenewos object
		l1.add(1231);// not allowed null
		l1.add(221);
		l1.add(3443);
		l1.add(65334);
		
		System.out.println("beforre sorting "+ l1);
		Collections.sort(l1,new ASeComparator());
		System.out.println("after sorting "+l1);
		System.out.println();
		Collections.reverse(l1);
		System.out.println(l1);
		System.out.println();
		System.out.println(Collections.binarySearch(l1,2323,new ASeComparator()));//
		System.out.println(Collections.binarySearch(l1,232354,new ASeComparator()));//
		System.out.println(Collections.binarySearch(l1,221,new ASeComparator()));//
		System.out.println();
	}
}
class ASeComparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		Integer i=(Integer)obj1;
		Integer i1=(Integer)obj2;
		return i1.compareTo(i);
	}
	
}

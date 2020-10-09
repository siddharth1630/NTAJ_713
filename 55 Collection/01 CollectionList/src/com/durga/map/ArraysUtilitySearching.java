package com.durga.map;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysUtilitySearching {
	public static void main(String[] args) {
		int[] a= {2,3,4,21,54,213,7,6,5};
		System.out.println("before sorting");
		for(int a1:a) {
			System.out.print(","+a1);
		}
		System.out.println();
		System.out.println("\n After sorting");
		Arrays.sort(a);
		for(int a1:a) {
			System.out.print(","+a1);
		}
		System.out.println("\n search "+Arrays.binarySearch(a, 4));
		System.out.println("search "+Arrays.binarySearch(a, 21332));
		System.out.println("search "+Arrays.binarySearch(a, 213));
		
		System.out.println();
		System.out.println(); 
		
		/*Arrays.sort(a,new ArraySortingComparator());		// not applicable for primitive type
		for(int a1:a) {
			System.out.print(","+a1);
		}*/
		String[] s= {"a","c","z","g","k"};
		System.out.println("before sorting");
		for(String s1:s)
			System.out.print(","+s1);
		System.out.println("\n search "+Arrays.binarySearch(s, "g"));	// it is not sort so we will get wrong output
		System.out.println("search "+Arrays.binarySearch(s, "l"));
		System.out.println("search "+Arrays.binarySearch(s, "a"));
		System.out.println("\n customized");
		Arrays.sort(s,new ArraySearchingComparator());
		for(String s1:s)
			System.out.print(","+s1);
		System.out.println("\n search without comparotor "+Arrays.binarySearch(s, "g"));
		System.out.println("search without comparotor "+Arrays.binarySearch(s, "l"));
		System.out.println("search without comparotor "+Arrays.binarySearch(s, "a"));
		System.out.println();
		System.out.println();
		System.out.println("\n search with comparotor "+Arrays.binarySearch(s, "g",new ArraySearchingComparator()));
		System.out.println("search with comparotor "+Arrays.binarySearch(s, "l",new ArraySearchingComparator()));
		System.out.println("search with comparotor "+Arrays.binarySearch(s, "a",new ArraySearchingComparator()));
		System.out.println();
		
		
	}
}
class ArraySearchingComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
	
}


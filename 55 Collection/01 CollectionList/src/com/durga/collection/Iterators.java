package com.durga.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		for(int i=0;i<=10;i++)
			al.add(i);
		System.out.println(al);
		
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			Integer in=(Integer)i.next();
			if(in%2==0)
				System.out.println(in);
			else
				i.remove();
		}
		System.out.println(al);
	}
}

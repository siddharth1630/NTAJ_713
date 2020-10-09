package com.collection.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Bpg389_IteratorWithInstanceOf {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet<>();
		l.add("dasff");
		l.add(23);
		l.add("adsf");
		l.add(2342);
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			
			if(obj instanceof String) {
				String str=obj.toString().toUpperCase();
				System.out.println("modified string "+str);
			}
			else
				System.out.println(obj);
		}
	}
}

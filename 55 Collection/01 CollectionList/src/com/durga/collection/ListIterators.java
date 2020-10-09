package com.durga.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("sid");
		l.add("raj");
		l.add("vkg");
		l.add("chin");
		
		System.out.println(l);
		
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			String s=(String)li.next();
			if(s.equals("sid")) {
				li.remove();
			}
			else if(s.equals("vkg"))
				li.set("vivke");
			else if(s.equals("chin"))
				li.add("sumit");
		}
		System.out.println(l);
		
	}
}

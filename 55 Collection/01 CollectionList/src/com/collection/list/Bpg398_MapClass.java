package com.collection.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bpg398_MapClass {
	public static void main(String[] args) {
		HashMap h=new HashMap<>();
		LinkedHashMap l=new LinkedHashMap<>();
		TreeMap t=new TreeMap<>();
		
		h.put(1, new Double(4000.0));
		h.put(5, new Double(3500.50));
		h.put(3, new Double(2125.25));
		
		l.put(1, new Double(4000.0));
		l.put(5, new Double(3500.50));
		l.put(3, new Double(2125.25));
		
		t.put(1, new Double(4000.0));
		t.put(5, new Double(3500.50));
		t.put(3, new Double(2125.25));
		
		System.out.println("hashmpa "+h);
		System.out.println("Lhashmap "+l);
		System.out.println("treemap "+t);
		
		// gettign the set of keys and getting the iterator
		Set set=h.keySet();
		Iterator hi=set.iterator();
		
		System.out.println("\n The accoutn balance hm account holders:");
		while(hi.hasNext()) {
			Object key =hi.next();
			Object value =h.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		
		System.out.println("\n the account balance of linked hash map acount holders");
		// getting the collection of values and getting iterator
		Collection lcol=l.values();
		Iterator li=lcol.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println("\n The account balance of tree map account holders:");
		
		// getting the set of entries and obtaining iterator
		Set tmset =t.entrySet();
		Iterator ti=tmset.iterator();
		while(ti.hasNext()) {
			Map.Entry me=(Map.Entry)ti.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		double balance =((Double)h.get(1)).doubleValue();
		h.put(1,new Double(balance+1000));
		System.out.println(" john's new balance: "+h.get(1));	
		
	}
}

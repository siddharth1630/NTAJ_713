package com.collection.list;

import java.util.Enumeration;
import java.util.Hashtable;

public class Bpg399_HashTable {
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("tom", new Double(23.32));
		h.put("henery", new Double(12.25));
		h.put("scott", new Double(5.42));
		
		System.out.println("hash table elements "+h);
		
		Enumeration e=h.keys();
		System.out.println("Employee name \t\t Employee sal");
		while(e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"\t\t"+h.get(key));
		}
		System.out.println();
		double sal=((Double)h.get("scott")).doubleValue();
		sal +=11.25;
		h.put("kean", new Double(sal));
		h.put("scott", new Double(sal));
		e=h.keys();
		System.out.println();
		System.out.println("The changed vlaues are: ");
		while(e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"\t\t"+h.get(key));
		}
	}
}

//package com.collection.api;

import java.util.concurrent.CopyOnWriteArraySet;

public class COW_ArraySet {
	public static void main(String[] args) {
		CopyOnWriteArraySet c=new CopyOnWriteArraySet<>();
		
		c.add("a");
		c.add("b");
		c.add(null);
		c.add(23);
		c.add("a");
		System.out.println(c);
		
	}
}

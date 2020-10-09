package com.durga.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSets {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet<>();
		hs.add("sid");
		hs.add("gutpa");
		hs.add("raj");
		hs.add(32);
		hs.add(234.23);
		hs.add(new StringBuffer("sid"));
		hs.add(null);
		hs.add(null);
		System.out.println(hs.add(null));	// false
		hs.add("sid");
		System.out.println(hs);
	}
}

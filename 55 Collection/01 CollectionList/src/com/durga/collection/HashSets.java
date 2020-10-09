package com.durga.collection;

import java.util.HashSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add("sid");
		hs.add("gutpa");
		hs.add("raj");
		hs.add(32);
		hs.add(234.23);
		hs.add(new StringBuffer("sid"));
		hs.add(null);
		hs.add(null);
		hs.add("sid");
		System.out.println(hs);
	}
}

package com.collection.list;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Bpg381_AllSetClasses {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		LinkedHashSet lhs=new LinkedHashSet<>();
		TreeSet ts=new TreeSet();
		
		System.out.println("hashset lenght "+hs.size());
		System.out.println("linkedhashset length "+lhs.size());
		System.out.println("Trees set length "+ts.size());
		
		hs.add("sid");
		hs.add(33);
		hs.add("ABC");
		hs.add(Integer.toString(20));
		hs.add(new Character('a'));
		hs.add(new String("abc"));
		hs.add(new Example());
		hs.add(null);
		hs.add(null);
		System.out.println(hs.add(null));
		System.out.println();
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("==============================");
		System.out.println();
		
		lhs.add("sid");
		lhs.add(33);
		lhs.add("ABC");
		lhs.add(Integer.toString(20));
		lhs.add(new Character('a'));
		lhs.add(new String("abc"));
		lhs.add(new Example());
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs.add(null));
		System.out.println();
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println("==============================");
		System.out.println();
		
		ts.add("sid");
	//	ts.add(33);
		ts.add("ABC");
	//	ts.add(Integer.toString(20));
	//	ts.add(new Character('a'));
		ts.add(new String("abc"));
	//	ts.add(new Example());
	//	ts.add(null);
	//	ts.add(null);
	//	System.out.println(ts.add(null));
		System.out.println();
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println("==============================");
		System.out.println();
		
		
	}
}

class Example{
	int x=10;
	int y=20;
}

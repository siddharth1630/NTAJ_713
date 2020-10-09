package com.durga.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		TreeMap t=new TreeMap<>();
		t.put(1,"sid");
		t.put(2, "babu");
		t.put(3, "ratan");
		t.put(4, "vkg");
	//	t.put(null, null);
		t.put(4, "siddhar");
		t.put(5, null);
		t.put(7,"fish");
	//	t.put("sd",3);
		System.out.println(t);
		
		System.out.println(t.ceilingKey(3)+" ceiling key");	
		System.out.println(t.firstKey()+" first key");	
		System.out.println(t.floorKey(4)+" floor key");	
		System.out.println(t.lastKey()+" lst key");
		System.out.println(t.higherKey(2)+" higher key");
		System.out.println(t.lowerKey(3)+" lower key");
		System.out.println(t.ceilingEntry(4)+" celing entry");
		System.out.println(t.headMap(5)+" head map");//
		System.out.println(t.tailMap(2)+" tail map");
		System.out.println();
		
		TreeMap t1=new TreeMap<>(new TreeComparator());
		t1.put(1,"sid");
		t1.put(2, "babu");
		t1.put(3, "ratan");
		t1.put(4, "vkg");
	//	t1.put(null, null);
		t1.put(4, "siddhar");
		t1.put(5, null);
		t1.put(7,"fish");
		t1.put("sd",3);
		System.out.println(t1);		
	}
}

class TreeComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
	
}

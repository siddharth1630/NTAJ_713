package com.durga.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class IdetittyAndWeakHM {
	public static void main(String[] args) throws InterruptedException{
		IdentityHashMap m=new IdentityHashMap<>();
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		m.put(i, 20);
		m.put(i1, "dsid");
	//	System.out.println(m);
		System.out.println();
		
	//	HashMap h=new HashMap<>();
		WeakHashMap h=new WeakHashMap<>();
		Temp t=new Temp();
		h.put(t, "durga");
		System.out.println(h);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(h);		
	}
}
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("finalize");
	}
	
}

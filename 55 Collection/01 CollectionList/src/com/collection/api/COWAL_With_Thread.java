package com.collection.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL_With_Thread extends Thread{
	static CopyOnWriteArrayList al=new CopyOnWriteArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println("child thread updating array list");
		al.add("d");
	}
	
	public static void main(String[] args) throws InterruptedException{
		al.add("a");
		al.add("b");
		al.add("c");
		COWAL_With_Thread t=new COWAL_With_Thread();
		t.start();		
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			String s1=(String)i.next();
			System.out.println("main thread iterating array list "+s1);
			Thread.sleep(3000);
		}
		System.out.println(al);
	} 	
}

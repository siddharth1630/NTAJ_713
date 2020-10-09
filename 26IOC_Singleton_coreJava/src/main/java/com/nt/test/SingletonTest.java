package com.nt.test;

import com.nt.printer.Printer;
import com.nt.printer.Printer1;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p=null;
		Printer p1=null;
		p=Printer.getInstance();
		p1=Printer.getInstance();
		System.out.println(p.hashCode()+" "+p1.hashCode());
		System.out.println(p==p1);
		System.out.println("=============================");
		
		Printer1 p2=null,p3=null;
		p2=Printer1.INSTANCE;
		p3=Printer1.INSTANCE;
		System.out.println(p2.hashCode()+" "+p3.hashCode());
		System.out.println(p2==p3);
		System.out.println("=============================");
		System.out.println(p2.msg());
		
		

	}

}

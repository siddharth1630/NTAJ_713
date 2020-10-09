package com.nt.printer;

public class Printer {
	private static Printer instance=null;
	private Printer() {
		System.out.println("Printer.Printer()");
	}
	public static Printer getInstance() {
		if(instance==null) {
			instance=new Printer();
		}
		return instance;		
	}
}

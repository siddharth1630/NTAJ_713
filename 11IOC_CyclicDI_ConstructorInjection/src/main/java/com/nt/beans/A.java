package com.nt.beans;

public class A {
	
	private B b;
	
	
//  CASE 1
//	public A(B b) {
//		super();
//		this.b = b;
//	}
	
	// CASE 2

	public void setB(B b) {
		this.b = b;
	}
	
	public A() {
		System.out.println("A.A()");
	}




	@Override
	public String toString() {
		return "A [b=" + b + "]";	

	}


	
	

}

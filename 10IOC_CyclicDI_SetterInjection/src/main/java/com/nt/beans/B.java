package com.nt.beans;

public class B {
	
	private A a;
	
	

	public B() {
		System.out.println("B.B()");
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
	//	return "B [a=" + a + "]";	// here if we call a class value then it goes to infinite loop and gives 
		return "B [a=";			// StackOverflowException
	}
	
	

}

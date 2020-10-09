package com.nt.comp;

public class Test {
	private int a,b;		// for test 2
	
	static {
		System.out.println("Test.enclosing_method()");
	}

	public Test() {
		System.out.println("0 param");
	}
	

	public Test(int a, int b) {			// for test 2
		System.out.println("1 param");
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
}

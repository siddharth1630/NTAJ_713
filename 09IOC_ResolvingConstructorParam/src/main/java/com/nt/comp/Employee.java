package com.nt.comp;

public class Employee {
	private String ename;
	private int eno;
	private float avg;
	
	public Employee(String ename, int eno, float avg) {
		this.ename = ename;
		this.eno = eno;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eno=" + eno + ", avg=" + avg + "]";
	}
	
	
	
}

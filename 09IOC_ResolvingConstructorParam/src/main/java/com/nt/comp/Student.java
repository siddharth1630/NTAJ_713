package com.nt.comp;

public class Student {
	private int sno;
	private String sname;
	private String saddrs;
	private int avg;
	
	
	// for constructor injection
	public Student(int sno, String sname, String saddrs, int avg) {
		this.sno = sno;
		this.sname = sname;
		this.saddrs = saddrs;
		this.avg = avg;
	}




	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", avg=" + avg + "]";
	}
	
	
	
	

}

package com.nt.comp;

public class Student {
	private int sno;
	private String sname;
	private String saddrs;
	private int avg;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// for constructor injection
	public Student(int sno, String sname, String saddrs, int avg) {
		this.sno = sno;
		this.sname = sname;
		this.saddrs = saddrs;
		this.avg = avg;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", avg=" + avg + "]";
	}
	
	
	
	

}

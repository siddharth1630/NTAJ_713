package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	private int cno;
	private String cname;
	private String caddr;
	
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", caddr=" + caddr + "]";
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Required
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	
	
	
}

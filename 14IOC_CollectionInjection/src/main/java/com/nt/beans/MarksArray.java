package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class MarksArray {
	private int marks[];
//	private Date sysdate;
	
	private Date[] allDate;

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	
	/*
	 * public void setSysdate(Date sysdate) { this.sysdate = sysdate; }
	 */
	 
	
	@Override
	public String toString() {
		return "MarksArray [marks=" + Arrays.toString(marks) + ", allDate=" + Arrays.toString(allDate) + "]";
	}

	public void setAllDate(Date[] allDate) {
		this.allDate = allDate;
	}
}

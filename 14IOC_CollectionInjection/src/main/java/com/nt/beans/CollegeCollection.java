package com.nt.beans;

import java.util.Date;
import java.util.List;

public class CollegeCollection {
	private List<String> studentName;
	private List<Date> allDates;
	
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
	public void setAllDates(List<Date> allDates) {
		this.allDates = allDates;
	}
	@Override
	public String toString() {
		return "CollegeCollection [studentName=" + studentName + ", allDates=" + allDates + "]";
	}
	
	
	
	
	
	
	
	
	

}

package com.nt.model;

import lombok.Data;

@Data
public class Student {
	private Integer sno;	// WE TAKE WRAPPER TYPE OF OBJECT BECAUSE IT GIVES NULL	
	private String sname;	// WHICH IS NOT SHOW BY DEFAULT IN FORM FIELD
	private String sadd;
	private Float avg;
	
	public Student() {
		System.out.println("Student.Student()"+this.hashCode());
	}
}

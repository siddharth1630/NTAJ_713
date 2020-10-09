// project 2 xpg 57
package com.nit.bean;

import com.nit.helper.CourseMap;

public class Student {
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public Student(int sno,String sname,String course,double fee) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
		this.fee=fee;		
	}
	@Override
	public int hashCode() {
		return CourseMap.getCourseNum(course);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return (this.course.equals(s.course)) && (this.sno==s.sno);
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return "In student("+sno+","+sname+","+course+","+fee+")";
	}
}

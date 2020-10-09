package com.nt.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.nt.bean.Student_Bean;
import com.nt.dao.Student_DAO;

public class FrontOffice {
	public static void main(String[] args) {
		Student_DAO dao=new Student_DAO();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter course to be searched");
		String course=sc.next();
		course=course.toUpperCase();
		
		ArrayList studentList=dao.getStudent(course);
		System.out.println("sno \t sname \t course \t fee");
		System.out.println("==============================================");
		
		for(int i=0;i<studentList.size();i++) {
			Student_Bean bean=(Student_Bean)studentList.get(i);
		
			System.out.print(bean.getSno()+"\t");
			System.out.print(bean.getSname()+"\t");
			System.out.print(bean.getCourse()+"\t");
			System.out.print(bean.getFee()+"\t");
			System.out.println();
		}
		
	}

}

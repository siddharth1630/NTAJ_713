// project 2 xpg 57
package com.nit.user;

import java.util.LinkedHashSet;

import com.nit.bean.Student;

public class School {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(new Student(101,"hari","corejava",1000));
		lhs.add(new Student(102,"balya","crt",600));
		lhs.add(new Student(103,"durga","servlet java",1200));
		lhs.add(new Student(104,"hari","java",1000));
		lhs.add(new Student(101,"natraj","advance java",2000));
		lhs.add(new Student(103,"sathish","plsql",2200));
		lhs.add(new Student(106,"murli","oracle",1000));
		
		System.out.println(lhs);
		lhs.remove(new Student(102,"balya","crt",600));
		System.out.println(lhs);
	}
}

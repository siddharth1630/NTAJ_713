// WAP TO ADD EMPLOYEE OBJ LIST TYPE COLLECTION THESE ADDED EMPLOYEE OBJECTS MUST BE FOUND BY USING NEW REFERENCED OBJECTS
// WITH SAME DATA
package com.collection.list;

import java.util.ArrayList;

public class Xpg36_AddEmployeeObject {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(new Emp("sid",22,"manager"));
		al.add(new Emp("vkg",23,"clerk"));
		al.add(new Emp("raj",28,"CEO"));
		System.out.println(al.contains(new Emp("sid",22,"manager")));
		System.out.println(al.contains(new Emp("vikash",55,"bpo")));
	
	}
}

class Emp{
	String name;
	int age;
	String job;
	
	public Emp(String name,int age,String job) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Emp) {
			Emp e=(Emp)obj;
			if ((this.age==e.age) && (this.name.equals(e.name)))
				return true;
			else 
				return false;
		}
		else 
			return false;	
	}	
}
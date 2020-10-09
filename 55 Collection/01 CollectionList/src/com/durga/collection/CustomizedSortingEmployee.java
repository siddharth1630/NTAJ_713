package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedSortingEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"sid");
		Employee e2=new Employee(2,"babu");
		Employee e4=new Employee(4,"chobey");
		Employee e5=new Employee(5,"opi");
		Employee e3=new Employee(3,"ratan");
		Employee e6=new Employee(5,"opi");
		
		TreeSet t=new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		System.out.println();
		
		System.out.println("customized");
		TreeSet t1=new TreeSet<>(new Customized());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
		
	}
}

class Employee implements Comparable{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	
	@Override
	public int compareTo(Object obj) {
		int id =this.id;
		Employee e=(Employee)obj;
		int id1=e.id;
		
		if(id==id1)
			return 0;
		else
			return 1;
		
		/*if(id<id1) {
			return -1;
		}
		else if(id>id1) {
			return 1;
		}
		else return 0;*/
			
	}
}
class Customized implements Comparator{

	
	public int compare(Object obj1, Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		
	}
	
}

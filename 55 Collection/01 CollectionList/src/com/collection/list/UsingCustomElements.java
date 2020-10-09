package com.collection.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class UsingCustomElements {
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
	/*	LinkedHashMap l=new LinkedHashMap<>();
		l.put(new Student(11,"Rama",11),new Addresss(1,2,"Hyd"));
		l.put(new Student(11,"Raju",12),new Addresss(1,3,"Hyd"));
		l.put(new Student(12,"Sita",11),new Addresss(12,30,"Sec"));
		l.put(new Student(12,"Rani",12),new Addresss(14,30,"Sec"));
		
		//storing studnemts information in file permanently for future refereence
		FileOutputStream f=new FileOutputStream("studentinfo.ser");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(l);
		System.out.println("\n student info is saved");
	}*/
	// reading students info form file
		FileInputStream fi=new FileInputStream("studentinfo.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		LinkedHashMap l=(LinkedHashMap)oi.readObject();
		Set keySet =l.keySet();
		Iterator i=keySet.iterator();
		
		while(i.hasNext()) {
			Object key =i.next();
			Object value=l.get(key);
			
			System.out.println(key+ " Student address");
			System.out.println(value);
			System.out.println();
		}
	}
}

class Addresss implements Serializable{
	int hno;
	int streetNo;
	String city;
	
	Addresss(int hno,int StreetNo,String ciyt){
		this.hno=hno;
		this.streetNo=streetNo;
		this.city=city;
	}
	public String toString() {
		return
				"house no "+hno +"\t"+
				"streetNo "+streetNo+ "\t"+
				"city "+city;
	}
	
}

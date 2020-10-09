package com.durga.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class HashTables {
	public static void main(String[] args) throws IOException,FileNotFoundException{
		Hashtable h=new Hashtable<>();
		h.put(new Temps(5),"A");
		h.put(new Temps(2),"B");
		h.put(new Temps(6),"C");
		h.put(new Temps(15),"D");
		h.put(new Temps(23),"H");
		h.put(new Temps(26),"E");
		h.put(new Temps(16),"F");
	//	h.put("durga",null);
		System.out.println(h);
		System.out.println(h.size());
		
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("abc.properties");
		p.load(f);
		System.out.println(p);
		p.setProperty("3", "siddharth");
		
		FileOutputStream o=new FileOutputStream("abc.properties");
		p.store(o, "budas");
	}
}

class Temps{
	int i;
	Temps(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+" ";
	}
}

package com.collection.list;

import java.util.Vector;
/*
public class Bpg376_UseDifferentMethodOfVector {
	public static void main(String args[]) {
		Vector v=new Vector();
		
		// Storing and removing element
		for(int i=0;i<=9;i++)
			v.addElement(new Integer(i*10));
		System.out.println("initial elements "+v);
		
		v.remove(3);
		v.removeElementAt(5);
		System.out.println("after 3rd index and 5 deletion and before all deletion "+v );
		v.removeAllElements();
		System.out.println("after all deletion " + v);
	}
}*/

class Address{
	String hno,street,city,ph;
	Address(String hno,String street,String city,String ph){
		this.hno=hno;
		this.street=street;
		this.city=city;
		this.ph=ph;
	}
}

class Customer{
	String name;
	int age;
	Address address;
	
	Customer(String name,int age,Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public String toString() {
		return (" Name : "+name+
				"\n Age: "+age+
				"\n Mobile: "+address.ph+
				"\n Street: "+address.street+
				"\n City: "+address.city+
				"\n House no: "+address.hno
				);
	}
}

 //class VectorCapacitySizeDemo{
public class Bpg376_UseDifferentMethodOfVector {
	public static void main(String[] args) {
		Vector v=new Vector(3);
		
		System.out.println("Initial capacity and size of vector is ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		Customer c1=new Customer("Sid",23,new Address("kamal kothi","purandaha","deoghar","98355"));
		Customer c2=new Customer("vkg",45,new Address("lal kothi","purandaha","deoghar","98324355"));
		Customer c3=new Customer("sonu",63,new Address("255","hitech","delhi","98355"));
		Customer c4=new Customer("gupta",56,new Address("biliaya kothi","bilasi","deoghar","98355"));
		Customer c5=new Customer("vicky",34,new Address("chas","bokaro","ranchi","98355"));
		Customer c6=new Customer("opi",332,new Address("barmasia","bilasi","deoghar","98355"));
		Customer c7=new Customer("akash",223,new Address("kunda","thana","kunda","98355"));
		Customer c8=new Customer("manish",2323,new Address("pahad","tapone","bihar","98355"));
		
		v.add(c1);
		v.add(c2);
		
		System.out.println("reached ites capacity or not ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		v.add(c3);
		System.out.println("reached ites capacity or not ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		v.add(c4);
		System.out.println("reached ites capacity or not ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		v.add(c5);
		v.add(c6);
		System.out.println("reached ites capacity or not ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		v.add(c7);
		v.add(c8);
		System.out.println("reached ites capacity or not ");
		System.out.println("capacity "+v.capacity());
		System.out.println("size "+v.size());
		System.out.println();
		
		System.out.println("The customer labels are ");
		System.out.println();
		System.out.println("is empty "+v.isEmpty());
		System.out.println("first elememtn is "+v.firstElement());
		System.out.println();
		System.out.println("last element is "+v.lastElement());
		System.out.println();
		
		v.insertElementAt("sid", 3);
		v.setElementAt("SIDDHARTH",3);
		v.removeElement("sid");
		v.removeElementAt(3);
	//	v.setSize(7);
		v.addElement("hawa - hawai");
		
		System.out.println(v.elementAt(8));
		
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println();
		}
	//	v.removeRange(3,5);
		v.trimToSize();
		v.remove(1);
		v.remove(c8);
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println();
		}
		
		v.clear();
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println();
		}

	
		System.out.println("after clear before remove all");
		v.removeAllElements();	
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println();
		}
		System.out.println(v.size()+ " "+v.capacity());
		
	}
}

/*	VECTOR ALL METHOD ARE
 * isEmpty				used
 * addElement			used
 * elementAt			used
 * firstElement			used
 * lastElement			used
 * insertElementAt		used
 * setElementAt			used
 * removeElement		used
 * removeAllElement		used
 * removeElementAt		used
 * removeRange			can't use becz it is protected
 * size					USED	
 * capacity				USED
 * ensureCapacity
 * trimToSize			used
 * setSize				used
 * elements
 * copyInto
 * clone
 * ===================================================
 * add()				used
 * addAll()
 * remove()				used
 * removeAll()
 * clear()				used
 * contains()			used
 * containsAll()
 * retainAll()
 * size()				used
 * iterator()
 * equals()
 * hashCode()			used
 * toArray()
 * toArray
 * ==========================================
 */


//Bpg374_AddingRetrievingRemovingElement_FromArrayList

package com.collection.list;

import java.util.ArrayList;

public class Bpg374_UseDifferentMethodOfArrayList {
	public static  void main(String args[]) {
		ArrayList al=new ArrayList();
		System.out.println("inital size of array list is "+al.size());
		System.out.println("contents fo the arraylist before add "+al);
		System.out.println("the array list is empty "+al.isEmpty());
		System.out.println();
		
		// adding elemetn to the array list
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("white");
		al.add("red");
	
		System.out.println("size of arraylist after adding some elements "+al.size());
		
		// display the array list
		System.out.println("contents fo the arraylist after add "+al);
		
		//Remove 2nd index element
		al.remove(2);
		System.out.println("after removing 2nd index "+al);
		
		//removing red element
		al.remove("red");
		System.out.println("after removing with red element"+al);
		System.out.println("and its size is "+al.size());
		System.out.println();
		
		// retriving 1st index elemtn
		String alElement=(String)(al.get(1));
		System.out.println("retrive 1st index ele "+alElement);
		
		// inserting at 2nd index
		al.add(2, "rose");
		System.out.println("newly added element is "+al.get(2));
		System.out.println("all elemnt is "+al);
		System.out.println("Red is contains or not "+al.contains("red"));
		System.out.println();
		
		System.out.println("hashcode -->  "+al.hashCode());
		al.set(2, "purple");
		System.out.println("before deletion all eelemt "+al);
		System.out.println("used index of methdo"+al.indexOf("purple"));
		System.out.println("using last index of "+al.lastIndexOf("white"));
		System.out.println("sub list between two indexes is "+al.subList(0, 3));
		
		
		al.clear();
		System.out.println("after clearing alll the elemtns "+al);
	}
}

/* ARRAY LIST METHOD IS
 * isEmpty()			used
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
 * get()				used
 * set()				used
 * indexOf()			used
 * lastIndexOf()		used
 * subList()			used
 * ListIterator()
 * ================================================ 
 */

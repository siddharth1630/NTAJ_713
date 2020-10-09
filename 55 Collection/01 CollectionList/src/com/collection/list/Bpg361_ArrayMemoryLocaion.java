// in this program we can increase the size of the array when its sized is reached to maximum

package com.collection.list;

import java.util.Scanner;

public class Bpg361_ArrayMemoryLocaion {
	private static int[] number=new int[5];
	private int index=0;
	
	public static void main(String args[]) {
		NIT n=new NIT();
		n.add(5);
		n.add(6);
		n.add(100);
		n.add(5);
		n.add(6);
		n.add(1);
		
		n.all();
		System.out.println();
		
		n.replace(0, 10);
		n.remove(1);
		n.insert(1, 999);
		
		n.all();
		System.out.println();
		
		System.out.println("capacity "+n.capacity());
		System.out.println("size "+n.size());
		System.out.println("get 1--> "+n.get(1));
		System.out.println("get 0--> "+n.get(0));
		System.out.println();
		n.all();
		
	}	
}
/*		Scanner sc=new Scanner(System.in);
		int i=0;
		
		System.out.println("Enter "+number.length+" number");
		for(i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}	
		
		System.out.println();
		System.out.println("The array is ");
		for(i=0;i<number.length;i++) {
			System.out.println(number[i]+ " ");
		}
		
		if(capacity()==number.length) {
			int[] tempNumber=new int[number.length*2];
		
			System.out.println("Enter "+number.length+" number");
			for(i=0;i<number.length;i++)
				tempNumber[i]=number[i];
			for(i=number.length;i<tempNumber.length;i++)
				tempNumber[i]=sc.nextInt();
			
			System.out.println();
			System.out.println("The array is ");
			for(i=0;i<tempNumber.length;i++) {
				System.out.println(tempNumber[i]+ " ");
			}
			System.out.println();
		}
	}
*/
	
class NIT{
	private static int[] number=new int[5];
	private int index=0;

	public void add(int n) {
		if(size()==capacity())
			incrementCapacity();
		number[index]=n;
		index++;
	}
	
	public int size() {
		return index;
	}
		
	public  int capacity() {
		  return number.length;
	}
	
	private void incrementCapacity() {
		int[] tempNumber=new int[capacity()*2];
		for(int i=0;i<number.length;i++)
			tempNumber[i]=number[i];
		number=tempNumber;
	}	
	public int get(int n) {
		return number[n];
	}
	public int replace(int index,int num) {
		return number[index]=num;
	}
	public void remove(int del) {
		for(;del<size();del++)
			number[del]=number[del+1];
		number[del]=0;
		index--;
	}
	public void insert(int index,int num) {
		if(size()==capacity()) 
			incrementCapacity();
		for(int i=size()-1;i>=index;i--)
			number[i+1]=number[i];
		number[index]=num;
		index++;		
	}
	public void all() {
		for(int i=0;i<size();i++) 
			System.out.println(number[i]);
	}
}

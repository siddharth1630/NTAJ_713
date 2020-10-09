//WAP FOR ADDING EMPLOYEES SALARY AND NAME,DISPLAY ALL THESE 3 EMPLOYEES DETAIL IN TABULAR
// FORMAT AND IN UPPERCASE
package com.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Xpg25_AddingEmployeeDetail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		
		System.out.println("Enter how many no of employee with its sallary");
		int emp=sc.nextInt()*2;
		for(int i=0;i<emp;i++)
			al.add(sc.next());
		System.out.println(al);
		System.out.println();
		System.out.println("After arrangin in table format");
		System.out.println();
		
		/*for(int i=0;i<emp;i++) {
			if(i%2==0)
				System.out.println("Name--> "+al.get(i));
			else
				System.out.println("Sal--> "+al.get(i));
		}*/
		
		System.out.println("Name \t Sal");
		System.out.println("================");
		for(int i=0;i<al.size();i++) {
			Object ele=al.get(i);
			if(ele instanceof String) {
				String str=(String)ele;
				str=str.toUpperCase();
				if(i%2==0)
					System.out.print(al.get(i)+"\t");
				else {
					System.out.print(al.get(i));
					System.out.println();
				}
			}
			else
				System.out.println(ele);
		}			
	}
}

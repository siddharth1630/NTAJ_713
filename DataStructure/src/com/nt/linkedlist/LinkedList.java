package com.nt.linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList {
	public static Node root = null;
	
	public static void main(String[] args) {
	    int ch,ele;
	    Scanner  sc=new Scanner(System.in);
	    create();
	    while(true){
	        System.out.println("\n1 for add \n");
	        System.out.println("2 for count \n");
	        System.out.println("3 for display \n");

	        System.out.println("Enter choice");
	        ch=sc.nextInt();

	        switch(ch){
	            case 1: 
	                    break;

	            case 2: count();
	                    break;

	            case 3:display();
	                    break;

	            default: System.out.println ("invalid choice\n");
	        }
	    }
	//    sc.close();
	}
	public static void create() {
		Node start,end;
		Scanner  sc=new Scanner(System.in);
		while(true) {
			start=new Node();
			
			System.out.println("Enter data");
			start.data=sc.nextInt();
			if(root==null) {
				root=start;
				end=start;
			}
			else {
				end=new Node();
				end.node=start;
				end=start;
			}
			System.out.println("1 for continue");
			int ch=sc.nextInt();
			if(ch==1) {
				end.node=null;
				break;
			}
		}
	}
	static void count(){
	    int count=0;
	    Node node=root;
	    while(node!=null){
	        node=node.node;
	        count++;
	    }
	    System.out.println(count);
	}
	static void display()
	{
	    Node node;
	    if(root==null)
	    {
	        System.out.println("list is empty");
	    }
	    else
	    {
	        node=root;
	        while(node!=null)
	        {
	            System.out.println(node.data);
	            node=node.node;
	        }
	    }
	}
}

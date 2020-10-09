package com.nt.queue;

import java.util.Scanner;

public class StaticQueue {
	public static final int SIZE = 3;

	static int queue[]=new int[SIZE];
	static int front =0,rear=0;
	
	public static void main(String[] args) {
	    int ch,ele;
	    Scanner sc=new Scanner(System.in);
	    while(true){
	        System.out.println("\n1 for insert \n");
	        System.out.println("2 for delete \n");
	        System.out.println("3 for traverse \n");

	        System.out.println("Enter choice");
	        ch=sc.nextInt();
	        
	        switch(ch){
	            case 1: System.out.println("Enter no");
	                    ele=sc.nextInt();
	                    insert(ele);
	                    break;

	            case 2: delete();
	                    break;

	            case 3: traverse();
	                    break;

	            default: System.out.println ("invalid choice\n");
	        }
	    }
	}

	static void  insert(int ele){
	    if(rear==SIZE-1){
	        System.out.println("Queue is full");
	    }
	    else{
	        queue[rear]=ele;
	        rear++;
	        System.out.println("inserted");
	    }
	}
	static void  delete(){
	    if(front==rear){
	        System.out.println("There is no element to delete");
	    }
	    else{
	        System.out.println("deleted elemet is -->"+queue[front]);
	        for(int i=front+1;i<rear;i++) {
	        	queue[i-1]=queue[i];
	        }
	        rear--;
	    }
	}

	
	static void  traverse(){
	    if(front==rear){
	        System.out.println("underflow");
	    }
	    int i;
	    for(i=front;i<rear;i++){
	        System.out.println(queue[i]);
	    }
	}
}

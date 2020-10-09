package com.nt.stack;

import java.util.Scanner;

public class StaticStack {
	public static final int SIZE = 5;

	static int stack[]=new int[SIZE];
	static int top=-1;

	public static void main(String[] args) {
	    int ch,ele;
	    Scanner sc=new Scanner(System.in);
	    while(true){
	        System.out.println("\n1 for push \n");
	        System.out.println("2 for pop \n");
	        System.out.println("3 for peek \n");
	        System.out.println("4 for traverse \n");

	        System.out.println("Enter choice");
	        ch=sc.nextInt();

	        switch(ch){
	            case 1: System.out.println("Enter no");
	                    ele=sc.nextInt();
	                    push(ele);
	                    break;

	            case 2: pop();
	                    break;

	            case 3:peek();
	                    break;

	            case 4: traverse();
	                    break;

	            default: System.out.println ("invalid choice\n");
	        }
	    }
	//    sc.close();
	}

	static void  push(int ele){
	    if(top==SIZE-1){
	        System.out.println("Stack is full");
	    }
	    else{
	        stack[++top]=ele;
	        System.out.println("pushed");
	    }
	}
	static void  pop(){
	    if(top==-1){
	        System.out.println("There is no element to delete");
	    }
	    else{
	        System.out.println("deleted elemet is -->"+stack[top]);
	        --top;
	    }
	}

	static void  peek(){
	    if(top==-1){
	        System.out.println("stack is underflow");
	    }
	    else{
	        System.out.println("peak element is -->"+stack[top]);
	    }
	}
	static void  traverse(){
	    if(top==-1){
	        System.out.println("underflow");
	    }
	    int i;
	    for(i=top;i>=0;i--){
	        System.out.println(stack[i]);
	    }
	}


}

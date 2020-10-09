package com.nt.stack;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicStack {
	public static  int size;

	static int stack[];
	static int top=-1;

	public static void main(String[] args) {
	    int ch,ele;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the stack");
	    size=sc.nextInt();
	    stack=new int[size];
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
	//    sc.close();Stack
	}

	static void  push(int ele){
	    if(top==size-1){
	        System.out.println("Stack is full now increase the size of the stack by 1");
	        size=++size;
	        stack = Arrays.copyOf(stack,size);
                    
	//        stack=new int[size];
	        stack[++top]=ele;
	        System.out.println("pushed");
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
	        --size;
	        stack=Arrays.copyOf(stack, size);
	        System.out.println(stack.length);
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

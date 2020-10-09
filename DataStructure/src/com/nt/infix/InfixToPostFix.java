package com.nt.infix;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter infix expression");
		String infix=sc.next();
		
		Stack<Character> st=new Stack<Character>();
		
		String postfix="";
		for(int i=0;i<infix.length();i++) {
			int c=infix.charAt(i);
			if(c>=96)
				postfix+=infix.charAt(i);
			else {
				if(st.isEmpty()) {
					st.add(infix.charAt(i));
			//		continue;
				}
				else {
					char pop=st.pop();
					
					int v=pop;
					if(pop==infix.charAt(i)) {System.out.println("first");
						postfix+=pop;
						st.add(infix.charAt(i));
					}
					else if(c==43 || c==45) {System.out.println("sec...........");
						postfix+=pop;
						if(c==v) {
							postfix+=st.pop();
						}
						else {
							st.add(infix.charAt(i));
						}
					}
					else {
					//	st.add(pop);
						postfix+=pop;
						st.add(infix.charAt(i));
					}
				}		
			}
			System.out.println(postfix);
		}
		System.out.println(postfix);
	}
}

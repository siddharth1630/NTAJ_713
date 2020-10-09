package com.collection.list;

import java.util.Stack;

public class Bpg379_UseDifferentMethodOfStack {
	public static void main(String args[]) {
		Stack st=new Stack();
		st.push("sid");
		st.push(23);
		st.push("prity");
		st.push("misty");
		System.out.println(st);
		
		System.out.println();
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search("sid"));
		System.out.println(st.firstElement());
		st.push(new Integer(20));
		st.push(new Double(23.2));
		System.out.println(st);
	}

}

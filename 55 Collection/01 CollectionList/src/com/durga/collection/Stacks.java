package com.durga.collection;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.push("sid");
		s.push(21);
		s.push(23.32);
		System.out.println(s.peek());
		System.out.println(s.search(21));
		System.out.println(s);
	}
}

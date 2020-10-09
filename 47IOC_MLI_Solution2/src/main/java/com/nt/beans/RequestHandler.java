package com.nt.beans;

public class RequestHandler {
	private static int count;
	
	public RequestHandler() {
		count++;
		System.out.println("Request handler 0 param constructor with:: "+count);
		
	}
	public void handleRequest(String data) {
		System.out.println("handling req. with "+data+"using the object::: "+count);
	}
}

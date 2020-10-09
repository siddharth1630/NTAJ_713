package com.nt.beans;

public class WebContainer {
	private RequestHandler rh;
	
	public WebContainer() {
		System.out.println("web container 0 param constructor");
	}
	
	public void setRh(RequestHandler rh) {
		this.rh=rh;
	}
	
	public void processRequest(String data) {
		System.out.println("web container is processin req with data:: "+data+" by giving it to handleer");
		rh.handleRequest(data);
	}
}

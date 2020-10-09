package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer  {
	public WebContainer() {
		System.out.println("web container 0 param constructor"+this.getClass()+" "+this.getClass().getSuperclass());
	}
	@Lookup
	public abstract RequestHandler createRequestHandler(); 
	
	public void processRequest(String data) {	
	
		RequestHandler rh=null;
		System.out.println("web container is processin req with data:: "+data+" by giving it to handleer");
		// get dependent object using dependancy loopkup
		rh=createRequestHandler();
		// use dependent object
		rh.handleRequest(data);
	}
}

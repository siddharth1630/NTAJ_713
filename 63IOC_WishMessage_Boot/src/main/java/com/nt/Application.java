package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.WishMessage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage msg=null;
		ctx=SpringApplication.run(Application.class, args);
		msg=ctx.getBean(WishMessage.class);
		// call method 
		System.out.println(msg.getWishMsg());
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

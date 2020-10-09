package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Customer info=null;
		ctx=SpringApplication.run(Application.class, args);
		info=ctx.getBean("customer",Customer.class);
		System.out.println(info);
		info.print();
		((ConfigurableApplicationContext) ctx).close();
	}

}

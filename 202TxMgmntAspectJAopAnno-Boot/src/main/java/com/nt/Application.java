package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.BankMgmntService;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context=null;
		BankMgmntService bank=null;
		context=SpringApplication.run(Application.class, args);
		//get bean
		bank=context.getBean("bankService",BankMgmntService.class);
		// invoke method
		try {
			System.out.println(bank.trasnferMoney(1001, 1002, 500));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) context).close();
	}

}

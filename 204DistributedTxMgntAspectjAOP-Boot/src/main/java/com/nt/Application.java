package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.nt.service.BankService;

// for writing exclude we can disable the autoconfiguration for these classes
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		ctx=SpringApplication.run(Application.class, args);
		proxy=ctx.getBean("bankService",BankService.class);
		//invoke method
		try {
			System.out.println(proxy.transferMoney(1001, 1005, 3333));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.repo.CustomerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerRepo repo=null;
		
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		//get service class object
		repo=ctx.getBean(CustomerRepo.class);
		// invoke method
	//	repo.findBycAdd("hyd").forEach(System.out::println);
	//	repo.findBycName("siddharth").forEach(System.out::println);
	//	repo.findByBillAmntGreaterThan(20000.0).forEach(System.out::println);
	//	repo.findBycNameLike("s%").forEach(System.out::println);
	//	repo.findBycNameStartingWith("s").forEach(System.out::println);
	//	repo.findBycNameEndingWith("h").forEach(System.out::println);
	//	repo.findBycNameContaining("a").forEach(System.out::println);
		
	//	repo.findBycNameIsNotNull().forEach(System.out::println);
	//	repo.findBycNameIsNull().forEach(System.out::println);
		
	//	repo.findBycNameAndBillAmnt("siddharth", 13000.0).forEach(System.out::println);
	//	repo.findByBillAmntGreaterThanAndBillAmntLessThan(23000, 50000.0).forEach(System.out::println);
	//	repo.findByBillAmntBetween(20000.0, 24000.0).forEach(System.out::println);
	//	repo.findBycNameOrBillAmnt("viviek", 23000.0).forEach(System.out::println);
	//	repo.findByBillAmntBetweenOrderByCName(20000.0, 24000.0).forEach(System.out::println);
	//	repo.findBycNameNot("viviek").forEach(System.out::println);
		repo.findBycAddIn(List.of("delhi","hyd")).forEach(System.out::println);
		
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

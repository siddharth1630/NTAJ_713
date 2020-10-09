package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.CustomerService;
import com.nt.service.CustomerServiceImple;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerService service=null;
		
		
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		//get service class object
		service=ctx.getBean("custService",CustomerServiceImple.class);
		// invoke method
		try {
			// FOR SORTING
		//	service.fetchAllRecordFetchByProperty("cName", true).forEach(System.out::println);;
		//	service.fetchAllRecordFetchByProperties(false, "billAmnt","cNo").forEach(System.out::println);;
//=======================================================================================================
			// FOR PAGING
	//		service.fetchAllRecordPageNoAndPageSize(2, 4).forEach(System.out::println);
			
			service.fetchRecordByPagination(5);
			
		}
		catch(DataAccessException e) {
			e.printStackTrace();			
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;
import com.nt.service.CustomerServiceImple;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerService service=null;
		CustomerDTO dto=null;
		
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		//get service class object
		service=ctx.getBean("custService",CustomerServiceImple.class);
		// invoke method
		dto=new CustomerDTO();
		dto.setCAdd("indore");
		dto.setCName("viviek");	// for dto we can set n no. of eletemts for finding and it workd as AND operator
		try {
			service.fetchAllRecordsByGivenExampleDTO(dto).forEach(System.out::println);
		//	System.out.println(service.removeAllCustomer());
		}
		catch(DataAccessException e) {
			e.printStackTrace();			
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

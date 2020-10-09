package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.CustomerDTO;
import com.nt.entity.Customer;
import com.nt.service.CustomerService;
import com.nt.service.CustomerServiceImple;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerService service=null;
		CustomerDTO dto=null,dto1=null,dto2=null;
		List<CustomerDTO> listDto=null;
		
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		//get service class object
		service=ctx.getBean("custService",CustomerServiceImple.class);
		// invoke method
		try {
			/*	dto=new CustomerDTO();
				dto.setCName("sidddharth");
				dto.setCAdd("deoghar");
				dto.setBillAmnt(40000);
				System.out.println(service.registerCustomer(dto));
				*/
//===========================================================================================
			dto=new CustomerDTO();
			dto.setCName("vikash");
			dto.setCAdd("delhi");
			dto.setBillAmnt(15000);
			
			dto1=new CustomerDTO();
			dto1.setCName("siddharth");
			dto1.setCAdd("hyd");
			dto1.setBillAmnt(23000);
			
			dto2=new CustomerDTO();
			dto2.setCName("raj");
			dto2.setCAdd("jamshedpur");
			dto2.setBillAmnt(34234);
			
	//		System.out.println(service.registerCustomerGroups(Arrays.asList(dto,dto1,dto2)));// old method
			listDto=new ArrayList<CustomerDTO>();
			listDto.add(dto);
			listDto.add(dto1);
			listDto.add(dto2);
			System.out.println(service.registerCustomerGroups(listDto));	// it is also the old way
	//		System.out.println(service.registerCustomerGroups(List.of(dto,dto1,dto2)));// java 9 features
			
//===========================================================================================
		//	System.out.println(service.removeCustomerById(22));
			
		/*	System.out.println(service.removeGivenCustomer(Arrays.asList(new CustomerDTO(23),
					new CustomerDTO(24),new CustomerDTO(25)
					)));
		*/	
		/*System.out.println(service.removeGivenCustomer(List.of(new CustomerDTO(33),
				new CustomerDTO(34),new CustomerDTO(35)
				)));
		*/
			
//===========================================================================================
			System.out.println("total cusomter is--> "+service.fetchCustomerCount());
//===========================================================================================			
			/*System.out.println(service.fetchAllCustomers());	// old way
			service.fetchAllCustomers().forEach(System.out::println);
			service.fetchAllCustomers().forEach(e->{
				System.out.println(e);
			});*/
//===========================================================================================	
			System.out.println(service.fetchCustomerById(29));
			
			Optional<CustomerDTO> optDto=service.fetchCustomerById(29);
			if(optDto.isPresent()) {
				System.out.println(optDto.get());
			}
			else {
				System.out.println("record not found");
			}
			
		}
		catch(DataAccessException e) {
			e.printStackTrace();			
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

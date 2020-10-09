package com.nt;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Customer;
import com.nt.repo.CustomerRepo;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerRepo repo=null;
		
		// create IOC container
		ctx=SpringApplication.run(Application2.class, args);
		//get service class object
		repo=ctx.getBean(CustomerRepo.class);
		
		// calling pl/sql procedure having entity query with IN param using entity manager
		EntityManager manager=ctx.getBean(EntityManager.class);
		// create stored procedure query object
/*		StoredProcedureQuery procedure=manager.createStoredProcedureQuery("FETCHCUSTOMERDETAIL",Customer.class);
		// register procedure in IN param
		procedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter(2, Class.class, ParameterMode.REF_CURSOR);
		// set value to IN param
		procedure.setParameter(1, "hyd");
		// call pl/sql procedure
		List<Customer> list=procedure.getResultList();
		list.forEach(System.out::println);
	*/
		// for scalr query
		StoredProcedureQuery procedure=manager.createStoredProcedureQuery("FETCH_CUSTOMER_DETAIL_BYADDRS");
		procedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter(2, Class.class, ParameterMode.REF_CURSOR);
		// set value to IN param
		procedure.setParameter(1, "hyd");
		// call pl/sql procedure
		List<Object[]> list=procedure.getResultList();
		list.forEach(row->{
			for(Object val:row) {
				System.out.print(val+ " ");
			}
			System.out.println();
		});
		manager.close();
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

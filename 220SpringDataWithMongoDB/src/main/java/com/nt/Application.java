package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.document.Employee;
import com.nt.service.EmployeeMgmtService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Employee doc1=null;
		EmployeeMgmtService service=null;
		// get container
		ctx=SpringApplication.run(Application.class, args);
		// get service class object
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		try {
			/*	doc1=new Employee();
				doc1.setEid(456);
				doc1.setEname("siddharth");
				doc1.setEadd("hyd");
				doc1.setSalary(90000.0f);
				doc1.setCompany("ptc");
				doc1.setOldCompanies(new String[] {"HCL","Oracle"});
				System.out.println(service.registerEmployee(doc1));
			*/
		//	service.findAllEmployee().forEach(System.out::println);
		//	System.out.println(service.findEmpById(456));
		//	System.out.println(service.updateEmployeeSalary(456, 1000));
			System.out.println(service.removeEmployee(456));
		}
		catch(Exception e) {
			System.out.println("probelme with registration");
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

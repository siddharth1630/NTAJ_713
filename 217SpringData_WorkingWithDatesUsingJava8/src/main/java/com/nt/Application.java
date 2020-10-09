package com.nt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgntService;
import com.nt.service.EmployeeMgntServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgntService service=null;
		EmployeeDTO dto=null;
		ctx=SpringApplication.run(Application.class, args);
		
		service=ctx.getBean(EmployeeMgntServiceImpl.class);
		try {
			dto=new EmployeeDTO();
			dto.setEname("siddharth");
			dto.setDob(LocalDateTime.of(1995, 05, 3, 8, 44));
			dto.setDoj(LocalDate.of(2021, 05, 5));
			dto.setBatchTime(LocalTime.of(23, 55, 22));
			
			System.out.println("registered with id ->"+service.registerEmployee(dto));
	//		service.getAllEmployee().forEach(System.out::println);
			
		}
		catch(Exception e) {
			System.out.println("problem in inserting");
		}
		
	}

}

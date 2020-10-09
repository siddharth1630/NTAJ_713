package com.nt;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.PhoneNumberDTO;
import com.nt.dto.UserDTO;
import com.nt.entity.User;
import com.nt.service.TelecomManagementService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TelecomManagementService service=null;
		UserDTO userDto=null;
		PhoneNumberDTO phoneDto1=null,phoneDto2=null;
		ctx=SpringApplication.run(Application.class, args);
		service=ctx.getBean("teleService",TelecomManagementService.class);
		// prepare child objects
		phoneDto1=new PhoneNumberDTO();
		phoneDto1.setMobileNo(3543553L);
		phoneDto1.setProvider("idea");
		phoneDto1.setType("work");
		
		phoneDto2=new PhoneNumberDTO();
		phoneDto2.setMobileNo(2432432L);
		phoneDto2.setProvider("jio");
		phoneDto2.setType("gf");
		
		// parent object
		userDto =new UserDTO();
		userDto.setName("siddharth");
		userDto.setAddrs("hyd");
		userDto.setPhones(Set.of(phoneDto1,phoneDto2));// java 9 features
		
		// invoke method
		try {
			System.out.println(service.registerCustomer(userDto));
		}
		catch(Exception e) {
			System.out.println("problem in customer registration");
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}

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
		
		/*service.getDataByJoins().forEach(row->{
			for(Object val:row)
				System.out.print(val+"  ");
			System.out.println();
		});*/
		
		service.getDataByJoins1("hyd").forEach(row->{
			for(Object val:row)
				System.out.print(val+"  ");
			System.out.println();
		});
		((ConfigurableApplicationContext) ctx).close();
	}

}

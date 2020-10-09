package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.MainController;
import com.nt.service.PatientService;
import com.nt.service.PatientServiceImp;
import com.nt.vo.CovidPatientVO;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MainController controller=null;
		List<CovidPatientVO> vo=null;
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		// call method
		controller=ctx.getBean(MainController.class);
		try {
			vo=controller.gatherDetaiByHospName("SADAR");
			vo.forEach(list->System.out.println(list));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}

package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.config.PresentationConfig;
import com.nt.controller.MainController;
import com.nt.vo.CovidPatientVO;

public class NestedControllerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext parentCtx=null,childCtx=null;
		MainController controller =null;
		List<CovidPatientVO> vo=null;
		// create parent container
		parentCtx=new AnnotationConfigApplicationContext(AppConfig.class);
		// create child container
		childCtx=new AnnotationConfigApplicationContext();
		childCtx.setParent(parentCtx);
		childCtx.register(PresentationConfig.class);
		childCtx.refresh();
		// get controller obj
		controller=childCtx.getBean("controller",MainController.class);
		// invoke method
		try {
			vo=controller.gatherDetaiByHospName("SADAR");
	//		vo.forEach(System.out::print);
			vo.forEach(list->System.out.println(list));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) childCtx).close();
		((AbstractApplicationContext) parentCtx).close();

	}

}

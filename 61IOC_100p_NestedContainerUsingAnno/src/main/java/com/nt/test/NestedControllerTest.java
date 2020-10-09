package com.nt.test;

import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.BussinessAppConfig;
import com.nt.config.PresentationAppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;


public class NestedControllerTest {
	@Value("${cust.title}")
	static String title;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext parentCtx=null,childCtx=null;
		MainController controller =null;
		List<EmployeeVO> vo=null;
		// create parent container
		parentCtx=new AnnotationConfigApplicationContext(BussinessAppConfig.class);
		// create child container
		// NOTE: in this config there is no 2 param const. so we have use @lazy at controller
		// becz if we not do it. it will preinstantiate service class which is present at controller
		// is not found so it gives exception 
		/*childCtx=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		childCtx.setParent(parentCtx);
		*/			// FIRST WAY USING @LAZY AT CONTROLLER OR
		
		// 2ND WAY 
		childCtx=new AnnotationConfigApplicationContext();
		childCtx.setParent(parentCtx);
		childCtx.register(PresentationAppConfig.class);
		childCtx.refresh();
		
		
		
		
		// get controller obj
		controller=childCtx.getBean(MainController.class);
		// invoke method
		
		try {
			vo=controller.gatherEmpsByDesg(title, "developer", "ceo");
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

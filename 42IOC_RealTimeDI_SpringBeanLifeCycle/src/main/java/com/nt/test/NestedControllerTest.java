package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CovidPatientVO;

public class NestedControllerTest {

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		MainController controller =null;
		List<CovidPatientVO> vo=null;
		// create parent container
		parentCtx=new ClassPathXmlApplicationContext("com/nt/cnfgs/bussiness-beans.xml");
		// create child container
		childCtx=new ClassPathXmlApplicationContext(new String[]{"com/nt/cnfgs/presentation-beans.xml"},parentCtx);
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

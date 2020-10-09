package com.nt.test;



import java.util.Scanner;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PlayerVO;

// for using the placeholder in xml file we must have to use application context container
// BUT here i can use BeanFactory by explicit configurer the placeholder to activate it
public class Test {
	public static void main(String[] args) {
		// declaring variable
		Scanner sc=null;
		String name=null,team=null,runScored=null,timesOut=null,runsConceded=null,wicketTaken=null;
		PlayerVO vo=null;
//		ApplicationContext ctx=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PropertyPlaceholderConfigurer holder=null;
		MainController controller=null;
		String result=null;
		int choice=0;
		
		// taking value from the user
		sc=new Scanner(System.in);
		System.out.print("Enter Player Name-->");
		name=sc.next();
		System.out.print("\nEnter Team-->");
		team=sc.next();
		
		// choose batting aur bowling avg
		System.out.println("Press 1 for get Batting avg");
		System.out.println("Press 2 for get Bowling avg");
		choice=sc.nextInt();
		
		if(choice==1) {
			System.out.print("\nEnter Total runs-->");
			runScored=sc.next();
			System.out.print("\nEnter Total Out-->");
			timesOut=sc.next();
			runsConceded="0";
			wicketTaken="0";
		}
		else if(choice==2) {
			System.out.print("\nEnter Runs conceded-->");
			runsConceded=sc.next();
			System.out.print("\nEnter Wicket Taken-->");
			wicketTaken=sc.next();
			runScored="0";
			timesOut="0";
		}
		else {
			System.out.println("Wrong choice");
		}
		
	
		// initialising vo object
		vo=new PlayerVO();
		vo.setpName(name);
		vo.setTeam(team);
		vo.setRunScored(runScored);
		vo.setTimesOut(timesOut);
		vo.setRunsConceded(runsConceded);
		vo.setWicketTaken(wicketTaken);
		
		// create a IOC container
//		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// get property placeholderConfigurer
		holder=factory.getBean("pph",PropertyPlaceholderConfigurer.class);
		holder.postProcessBeanFactory(factory);
		
		// get bean id
		controller=factory.getBean("controller",MainController.class);
		
		// calling a controller and handle exception 
		try {
			result=controller.processPlayer(vo,choice) ;
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("DB error");
			e.printStackTrace();
		}
		
		sc.close();
	
		
	}

}

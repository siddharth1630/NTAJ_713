package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanAmntDetail;
import com.nt.beans.LoanAmntIntrestCalculator;
import com.nt.editors.LoanAmntIntrestCalcEditor;

public class CustomPropertyTestBF3 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		LoanAmntIntrestCalculator calc=null;
		CustomEditorConfigurer cec=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
		System.out.println("before CustomPropertyTestBF3.main()");
		cec=factory.getBean(CustomEditorConfigurer.class);
		cec.postProcessBeanFactory(factory);
		System.out.println("after CustomPropertyTestBF3.main()");
		
		calc=factory.getBean("calc",LoanAmntIntrestCalculator.class);
		// invoke method
		System.out.println(calc.intrest());
	}
}

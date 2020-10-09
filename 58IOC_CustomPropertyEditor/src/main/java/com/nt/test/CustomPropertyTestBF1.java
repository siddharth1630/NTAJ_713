package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanAmntDetail;
import com.nt.beans.LoanAmntIntrestCalculator;
import com.nt.editors.LoanAmntIntrestCalcEditor;

public class CustomPropertyTestBF1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		LoanAmntIntrestCalculator calc=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
		System.out.println("before creating custom object");
		// add custom property editor registrar to IOC container
		// creating the object of inner classes and the innerclass automatically call its method
		factory.addPropertyEditorRegistrar(new CustomRegistrar());
		System.out.println("after creating custom object");
		
		calc=factory.getBean("calc",LoanAmntIntrestCalculator.class);
		// invoke method
		System.out.println(calc.intrest());
	}
	
	// nested inner class
	// from here it will create object for my custom property editor which is called by client app
	private static class CustomRegistrar implements PropertyEditorRegistrar{
		public CustomRegistrar() {
			System.out.println("CustomPropertyTestBF1.CustomRegistrar.CustomRegistrar()");
		}
		
		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			System.out.println("inside inner class");
			// by writing below param means it will create object only for loanAmntDeatail not for
			// String,Date and any other
			registry.registerCustomEditor(LoanAmntDetail.class, new LoanAmntIntrestCalcEditor());
			System.out.println("after CustomRegistrar.registerCustomEditors()");
		}	
	}
}

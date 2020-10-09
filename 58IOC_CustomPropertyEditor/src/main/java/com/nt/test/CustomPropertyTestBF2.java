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

public class CustomPropertyTestBF2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		LoanAmntIntrestCalculator calc=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
		// here it is annonymous inner classes  which implements PropertyEditorRegistrar(I)
		// and creating the object of annonymous class
		/*factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {		
			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(LoanAmntDetail.class, new LoanAmntIntrestCalcEditor());		
			}
		});*/
		
		// by using lambda expression 
		factory.addPropertyEditorRegistrar( registry-> {
				registry.registerCustomEditor(LoanAmntDetail.class, new LoanAmntIntrestCalcEditor());		
		});
		
		calc=factory.getBean("calc",LoanAmntIntrestCalculator.class);
		// invoke method
		System.out.println(calc.intrest());
	}
}

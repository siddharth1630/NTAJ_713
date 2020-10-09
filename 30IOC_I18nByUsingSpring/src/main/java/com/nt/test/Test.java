package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null;
		String cap1=null,cap2=null,cap3=null,cap4=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		//prepare locale object
		locale=new Locale(args[0],args[1]);
		// get message
		cap1=ctx.getMessage("btn1.cap",null,"msg", locale);
		cap2=ctx.getMessage("btn2.cap",new String[] {"GUPTA"}, locale);	// here we can pass 5 arg in array and take 0 arg in prop file
		cap3=ctx.getMessage("btn3.cap1",null,"siddharth", locale);	// if we pass wrong key then it print this msg
		cap4=ctx.getMessage("btn4.cap",null, locale);
		
		System.out.println(cap1+" "+cap2+" "+cap3+" "+cap4);
		System.out.println("====================================================");
		System.out.println(ctx.getMessage("btn4.cap",null,new Locale("de","DE")));
		System.out.println(ctx.getMessage("btn4.cap",null,new Locale("fr","FR")));
		System.out.println(ctx.getMessage("btn4.cap",null,new Locale("hi","IN")));
		System.out.println(ctx.getMessage("btn4.cap",null,new Locale("x","y")));
		((AbstractApplicationContext) ctx).close();
	}
}

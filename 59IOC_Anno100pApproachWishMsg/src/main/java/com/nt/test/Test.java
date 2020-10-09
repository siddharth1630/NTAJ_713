package com.nt.test;

import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMessage;
import com.nt.cnfg.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage msg=null;
		System.out.println(" before Test.main()");
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(" after Test.main()");
	//	msg=ctx.getBean("wm",WishMessage.class);
	//	msg=ctx.getBean(WishMessage.class);
		msg=ctx.getBean("wishMessage",WishMessage.class);	// CASE 3 DEFAULT BEAN ID
		System.out.println(" after after Test.main()");
		
		System.out.println(msg.generateWishMessage());
		
		System.out.println("=============================================");
		// WE CAN WRITE BELOW CODE JUST FOR SEEING @BEAN DEFAULT ID
	//	LocalTime lt=ctx.getBean(LocalTime.class);
	//	LocalTime lt=ctx.getBean("getTime",LocalTime.class);	// call by its default bean id
		LocalTime lt=ctx.getBean("dt",LocalTime.class);
		System.out.println(lt.getHour());
		
		((AbstractApplicationContext) ctx).close();
	}

}

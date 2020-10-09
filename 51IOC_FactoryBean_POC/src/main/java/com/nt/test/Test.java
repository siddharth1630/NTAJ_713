package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.ScheduleReminder;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleReminder reminder=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		reminder=ctx.getBean("reminder",ScheduleReminder.class);
		System.out.println(reminder.knowReminder());
		
		((AbstractApplicationContext) ctx).close();

	}

}

package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonInfo;

public class PropertyEditorTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonInfo info=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		info=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		((AbstractApplicationContext) ctx).close();
	}
}

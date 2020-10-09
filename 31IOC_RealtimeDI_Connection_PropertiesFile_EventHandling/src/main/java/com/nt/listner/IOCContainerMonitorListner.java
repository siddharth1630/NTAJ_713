package com.nt.listner;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitorListner implements ApplicationListener {
	private long start,end;

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		if(e.toString().indexOf("ContextRefreshedEvent")!=-1) {
			start=System.currentTimeMillis();
			System.out.println("Container start at "+new Date());
		}
		else if(e.toString().indexOf("ContextClosedEvent")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("container end at "+new Date());
			System.out.println("total container duration is "+(end-start));
		}
		
	}

}

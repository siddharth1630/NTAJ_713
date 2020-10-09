package com.nt.cnfg;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.beans")
public class AppConfig {
	static {
		System.out.println("AppConfig.enclosing_method()");
	}
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	//@Bean
	@Bean("dt")
	public LocalTime getTime() {
		System.out.println("AppConfig.getTime()");
		return LocalTime.now();
	}
}

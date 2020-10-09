package com.nt.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
	
	@Bean
	public LocalTime time() {
		return LocalTime.now();
	}
}

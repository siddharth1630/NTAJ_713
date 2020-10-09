package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.nt.service,com.nt.dao"})
public class BussinessAppConfig {
	
	@Bean("ds")
	public HikariDataSource ds() {
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("springNatraj");
		hkds.setPassword("springnataraj");
		hkds.setMaximumPoolSize(20);
		hkds.setMinimumIdle(3000);
		
		return hkds;		
	}
}

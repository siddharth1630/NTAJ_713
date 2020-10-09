package com.nt.cnfgs;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistanceBean {
	
	@Bean(name="hkDs")
	public DataSource dataSource() {
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("springNatraj");
		hkds.setPassword("springnataraj");
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(2000);
		
		return hkds;
	}
	
	@Bean
	public JdbcTemplate template() {
		return new JdbcTemplate(dataSource());
	}
}

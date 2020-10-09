package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@ComponentScan(basePackages = "com.nt.dao")
// adding multiple properties file
@PropertySource(value = {"com/nt/commons/jdbc.properties","com/nt/commons/jdbc1.properties"})
public class PersistanceConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public HikariDataSource ds() {
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		/*hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("springNatraj");
		hkds.setPassword("springnataraj");
		hkds.setMaximumPoolSize(20);
		hkds.setMinimumIdle(3000);
		*/
		// by using property file
		hkds.setDriverClassName(env.getProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getProperty("jdbc.url"));
		hkds.setUsername(env.getProperty("jdbc.user"));
		hkds.setPassword(env.getProperty("jdbc.pass"));
		hkds.setMaximumPoolSize(Integer.parseInt(env.getProperty("pool.maxsize")));
		hkds.setMinimumIdle(Integer.parseInt(env.getProperty("pool.minidletime")));
		
		return hkds;
	}

}

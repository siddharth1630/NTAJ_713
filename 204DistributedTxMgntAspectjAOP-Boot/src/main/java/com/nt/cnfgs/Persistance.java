package com.nt.cnfgs;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atomikos.jdbc.AtomikosDataSourceBean;

@Configuration
public class Persistance {
	
	@Bean(name="oraXADS")
	@ConfigurationProperties(prefix = "dtx.orads")
	public AtomikosDataSourceBean createOracleXADS(){
		AtomikosDataSourceBean ds=null;
//		Properties props=null;
		ds=new AtomikosDataSourceBean();
/*		ds.setUniqueResourceName("oraXA");	// THIS PROPERTY IS DEFINE IN PROPERTIES FILE
		ds.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
		props=new Properties();
		props.setProperty("databaseName", "orcl");
		props.setProperty("URL", "jdbc:oracle:thin:@localhost:1521:orcl");
		props.setProperty("user", "springNatraj");
		props.setProperty("password", "springnataraj");
		
		ds.setXaProperties(props);*/
		return ds;
	}
	
	@Bean(name="mysqlXADS")
	@ConfigurationProperties(prefix = "dtx.mysqlds")
	public AtomikosDataSourceBean createMysqlXADS(){
		AtomikosDataSourceBean ds=null;
//		Properties props=null;
		ds=new AtomikosDataSourceBean();
/*	ds.setUniqueResourceName("mySqlXA");
		ds.setXaDataSourceClassName("com.mysql.cj.jdbc.MysqlXADataSource");
		props=new Properties();
		props.setProperty("databaseName", "spring");
		props.setProperty("URL", "jdbc:mysql:///spring");
		props.setProperty("user", "root");
		props.setProperty("password", "system");
		
		ds.setXaProperties(props);*/
		return ds;
	}
	
	@Bean(name="oraJT")
	public JdbcTemplate createOraJT() {
		return new JdbcTemplate(createOracleXADS());
	}
	
	@Bean(name="mysqlJT")
	public JdbcTemplate createMysqlJT() {
		return new JdbcTemplate(createMysqlXADS());
	}
	

}

package com.nt.cnfgs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nt.entity.Project;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistanceConfig {
	
	@Bean(name = "hkds")
	public DataSource createDataSource() { // object returned @Bean method becomes spring bean
		HikariDataSource hkds=null;
		hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("springNatraj");
		hkds.setPassword("springnataraj");
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(100);
		return hkds;
	}
	
	@Bean(name="sesfact")
	public LocalSessionFactoryBean createLocalSesFactBean() {
		LocalSessionFactoryBean bean=null;	// this factory class return resultant object 
		Properties prop=null;
		
		bean=new LocalSessionFactoryBean();
		bean.setDataSource(createDataSource());
		bean.setAnnotatedClasses(Project.class);
		
		prop=new Properties();
		prop.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		bean.setHibernateProperties(prop);
		return bean;	// it return original object
	}
	
	@Bean(name="ht")
	public HibernateTemplate createHT() {
		return new HibernateTemplate(createLocalSesFactBean().getObject()); // to get resultant object factory  bean object we need to call getClass
	}

}

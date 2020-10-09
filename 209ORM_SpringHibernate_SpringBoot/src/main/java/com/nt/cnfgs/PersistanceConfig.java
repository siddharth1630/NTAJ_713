package com.nt.cnfgs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nt.entity.Project;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistanceConfig {
	@Autowired
	DataSource ds;
	
	@Bean(name="sesfact")
	public LocalSessionFactoryBean createLocalSesFactBean() {
		LocalSessionFactoryBean bean=null;	// this factory class return resultant object 
		Properties prop=null;
		
		bean=new LocalSessionFactoryBean();
		bean.setDataSource(ds);
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

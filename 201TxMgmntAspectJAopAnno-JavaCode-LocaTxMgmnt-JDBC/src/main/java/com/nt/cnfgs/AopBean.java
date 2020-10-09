package com.nt.cnfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AopBean {
	@Autowired
	DataSource ds;
	
	@Bean(name="dsTx")
	public DataSourceTransactionManager dstm() {
		return new DataSourceTransactionManager(ds);
	}
}

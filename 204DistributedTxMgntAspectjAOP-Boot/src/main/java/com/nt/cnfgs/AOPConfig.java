package com.nt.cnfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;

@Configuration
public class AOPConfig {

	@Bean(name="dtxService")
	public UserTransactionImp createDTXService()throws Exception {
		UserTransactionImp txService=null;
		txService=new UserTransactionImp();
		txService.setTransactionTimeout(60);
		return txService;
		
	}
	
	@Bean(name="dtxManager")
	public UserTransactionManager createDTXManager()throws Exception {
		UserTransactionManager txManager=null;
		txManager =new UserTransactionManager();
		txManager.setForceShutdown(true);
		return txManager;
	}
	
	@Bean(name="jtaTxMngmr")
	public JtaTransactionManager jtaManager() throws Exception{
		JtaTransactionManager jtaManager=null;
		jtaManager=new JtaTransactionManager();
		jtaManager.setUserTransaction(createDTXService());
		jtaManager.setTransactionManager(createDTXManager());
		return jtaManager;
	}
}

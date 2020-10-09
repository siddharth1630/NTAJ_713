package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;

import com.ipl.external.IIPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<IIPLScoreComp> {

	private IIPLScoreComp extComp;
	
	public IPLScoreCompServiceLocatorFactoryBean() {
		extComp=new IPLScoreCompImpl();
	}

	@Override
	public IIPLScoreComp getObject() throws Exception {
		return extComp;				
	}

	@Override
	public Class<?> getObjectType() {
		return IIPLScoreComp.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
	
}

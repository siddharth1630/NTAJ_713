package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipl.external.IIPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;

@Component("locator")
public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<IIPLScoreComp> {
	@Autowired
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

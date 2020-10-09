package com.cb.locator;

import com.ipl.external.IIPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;

public interface IPLScoreCompServiceLocator  {
	static final IIPLScoreComp extComp=new IPLScoreCompImpl();	// eager instantiation
	
	public  static IIPLScoreComp getExtComp() {
		return extComp;
	}	
	
}

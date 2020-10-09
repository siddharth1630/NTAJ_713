package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("offer")
public class OfferReplacer implements MethodReplacer {
	public OfferReplacer() {
		System.out.println("OfferReplacer.OfferReplacer()");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("OfferReplacer.reimplement()");
		float pAmnt=0.0f;
		float rate=0.0f;
		int month=0;
		
		// get target/orignal method args value
		pAmnt=(float) args[0];
		rate=(float) args[1];
		month=(int) args[2];
		System.out.println(method.getName()+"= "+method.getReturnType()+"= "+method.getParameterCount()
				+" ="+method.toGenericString()+"= "+method.getClass()+" ="+method.getDefaultValue());
		System.out.println("============================");
		System.out.println(method.getClass().getSuperclass());
		return pAmnt*rate*month/100.0f;
	}

}

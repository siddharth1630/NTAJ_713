package com.nt.bpp;

import java.time.LocalDateTime;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.bo.BaseBean;

@Component
@Scope("prototype")
public class BeanDOJPostProcessor implements BeanPostProcessor {
	
	public BeanDOJPostProcessor() {
		System.out.println("BeanDOJPostProcessor.BeanDOJPostProcessor()");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof BaseBean) {
			((BaseBean) bean).setDate(LocalDateTime.now());
		}
		return bean;
	}
}

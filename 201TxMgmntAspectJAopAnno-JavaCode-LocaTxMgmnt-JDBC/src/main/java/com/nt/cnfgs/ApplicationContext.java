package com.nt.cnfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {AopBean.class,ServiceBean.class,PersistanceBean.class})
public class ApplicationContext {

}

package com.nt.cnfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {AOPConfig.class,PersistanceConfig.class,ServiceConfig.class})
public class ApplicationContext {

}

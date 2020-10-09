package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.nt.replacer")
@ImportResource("com/nt/cnfgs/applicationContext.xml")
public class AppConfig {

}

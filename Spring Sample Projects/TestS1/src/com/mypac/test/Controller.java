package com.mypac.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Controller {

	@Bean
	@Scope("singleton")
	public Employee getEmployee(){
		return new Employee();
	}
	
	@Bean
	@Scope("prototype")
	public Projects getProjects(){
		return new Projects();
	}
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public Task getTask(){
		return new Task();
	}
	
	@Bean
	public CStartEventHandler getCStartEventHandler(){
		return new CStartEventHandler();
	}
	
}

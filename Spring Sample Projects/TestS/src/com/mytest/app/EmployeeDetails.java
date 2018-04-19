package com.mytest.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class EmployeeDetails {
	private EmployeeSalary empSal;
	public String name;
	public String dep;
	
	

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

    @Required
	public void setDep(String dep) {
		this.dep = dep;
	}

    
	public EmployeeSalary getEmpSal() {
		return empSal;
	}

	@Autowired
	@Qualifier("empSalary1")
	public void setEmpSal(EmployeeSalary empSal) {
		this.empSal = empSal;
	}
	
	 @PostConstruct
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   
	   @PreDestroy
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
	

}

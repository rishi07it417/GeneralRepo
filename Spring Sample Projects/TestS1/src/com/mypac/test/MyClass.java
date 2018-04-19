package com.mypac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.event.ContextStartedEvent;


public class MyClass {


	public static void main(String args[]){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Controller.class);
	 
	   ctx.publishEvent(new ContextStartedEvent(ctx));
		
	   Employee emp =  ctx.getBean(Employee.class);
	   emp.setName("Rishi");
	   System.out.println("Employee set first is ::"+emp.getName());
	   
	   Projects prj = ctx.getBean(Projects.class);
	   prj.setProjects("Java");
	   System.out.println("Employee project first is ::"+prj.getProjects());
	   
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	   
	   Employee emp1 =  ctx.getBean(Employee.class);
	   System.out.println("Employee set first is ::"+emp1.getName());
	   
	   Projects prj1 = ctx.getBean(Projects.class);
	   System.out.println("Employee project first is ::"+prj1.getProjects());
	   
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	   CStartEventHandler c1 = ctx.getBean(CStartEventHandler.class);
	   c1.publish();

	   Task tsk =  ctx.getBean(Task.class);
	   tsk.setTaskName("Prepare Junit test case");
	   System.out.println("Employee set first is ::"+tsk.getTaskName());
	   
	   ((AbstractApplicationContext) ctx).registerShutdownHook();	   
	}
	
}

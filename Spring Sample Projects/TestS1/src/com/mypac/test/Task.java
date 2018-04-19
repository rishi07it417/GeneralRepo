package com.mypac.test;

public class Task {
	
	String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public void init(){
		System.out.println("------This is Task init method----------");
	}
	
	public void destroy(){
		System.out.println("------This is Task destroy method----------");
	}

}

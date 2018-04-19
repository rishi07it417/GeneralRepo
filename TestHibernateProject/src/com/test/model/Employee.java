package com.test.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

   @Id
   @Column(name = "ID", insertable = false, updatable = false)
   @SequenceGenerator(name = "SequenceIdGenerator", sequenceName = "TESTSEQUENCE", allocationSize=1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceIdGenerator")
   private int id;

   @Column(name = "NAME")
   private String name;

   @Column(name = "DEPARTMENT")
   private String department;

   @Column(name = "SALARY")
   private int salary;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department="
			+ department + ", salary=" + salary + "]";
}  

 
}
package com.test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.test.model.Employee;



public class EmployeeDao {

	public static void main(String args[]){
		try{
			SessionFactory sessionFactory = new AnnotationConfiguration().configure(EmployeeDao.class.getClassLoader().getResource("hibernate.cfg.xml")).buildSessionFactory();	
			Session se = sessionFactory.openSession();
			System.out.println(" ------ before new Employee ");

			Employee emp = new Employee();
			System.out.println(" ------ after new Employee ");
			se.beginTransaction();
			//emp.setId(2);
			emp.setName("Rishi");
			emp.setDepartment("IT");
			emp.setSalary(15000);
			System.out.println(" ------ before save ");
			se.save(emp);
			System.out.println(" ------ after save ");
se.getTransaction().commit();
			se.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

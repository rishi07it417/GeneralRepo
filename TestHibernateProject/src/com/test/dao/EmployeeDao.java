package com.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.test.model.Employee;



public class EmployeeDao {

	public static void main(String args[]){
		try{
			SessionFactory sessionFactory = new AnnotationConfiguration().configure(EmployeeDao.class.getClassLoader().getResource("hibernate.cfg.xml")).buildSessionFactory();	
			Session se = sessionFactory.openSession();
			 
			boolean isInserted = saveEmp(se,"Rishi1","Developer",25000);
			System.out.println("*********************Insertion Result"+ isInserted);
			
			boolean isUpdate = updateEmp(se,"Rishi1","Support",15000);
			System.out.println("*********************Updation Result"+ isUpdate);

			List<Employee> emp = getEmp(se);
			System.out.println("*********************Employee Get Result"+ emp.toString());

			
			se.getTransaction().commit();
			se.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


public static boolean saveEmp(Session se,String name,String department,Integer salary){
	try{
		System.out.println(" ------ Inside Save EMP----------- ");

		Employee emp = new Employee();
		se.beginTransaction();
		emp.setName(name);
		emp.setDepartment(department);
		emp.setSalary(salary);
		System.out.println(" ------ before save ");
		se.save(emp);
		System.out.println(" ------ after save ");
	}catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;
}


public static boolean updateEmp(Session se,String name,String department,Integer salary){
	try{
		System.out.println(" ------ Inside Save EMP----------- ");

		Employee emp = new Employee();
		se.beginTransaction();
		emp.setName(name);
		emp.setDepartment(department);
		emp.setSalary(salary);
		System.out.println(" ------ before save ");
		se.saveOrUpdate(emp);
		System.out.println(" ------ after save ");
	}catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;
}

public static List<Employee> getEmp(Session se){
	List<Employee> empList = null;
	try{
		System.out.println(" ------ Inside Save EMP----------- ");
		
		se.beginTransaction();
		
		Criteria cr = se.createCriteria(Employee.class);
		Criterion c1 = Restrictions.ge("salary", 20000);
	
		cr.add(c1);
		cr.setFetchSize(10);
		cr.addOrder(Order.desc("salary"));
		 
		 empList = cr.list();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return empList;
}

}


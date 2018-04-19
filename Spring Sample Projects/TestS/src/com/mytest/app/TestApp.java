package com.mytest.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		// First Msg
		TestAppPojo o = (TestAppPojo) context.getBean("testApp");		
		String str = o.getMyMsg();
		System.out.println("Main Class Msg 1st time::"+str);
		
		

		// Second Msg
		TestAppPojo o1 = (TestAppPojo) context.getBean("testApp");		
		String str1 = o.getMyMsg();
		System.out.println("Main Class Msg 2nd time::"+str1);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		// First TestPrototypePojo Msg
		TestPrototypePojo po = (TestPrototypePojo) context.getBean("testProtoTypeApp");		
		po.setMyMsg1("This is ProtoMsg");
		String str2 = po.getMyMsg1();
		System.out.println("Main Class TestPrototypePojo 1st time::"+str2);
		
		

		// Second TestPrototypePojo Msg
		TestPrototypePojo po1 = (TestPrototypePojo) context.getBean("testProtoTypeApp");		
		String str3 = po1.getMyMsg1();
		System.out.println("Main Class TestPrototypePojo 2nd time::"+str3);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		TestParent po3 = (TestParent) context.getBean("testParent");		
		String str4 = po3.getMyMsg1();
		System.out.println("Main Class ::"+str4);
		String strp = po3.getParentMsg();
		System.out.println("Main Class ::"+strp);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

		TestChild po4 = (TestChild) context.getBean("testChild");		
		String str5 = po4.getMyMsg1();
		System.out.println("Main Class ::"+str5);
		
		String str6 = po4.getMyMsg2();
		System.out.println("Main Class ::"+str6);
		String strp1 = po4.getParentMsg();
		System.out.println("Main Class ::"+strp1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		SemBooks semBook = (SemBooks) context.getBean("semBook");
		System.out.println("This Sem Book Details::"+semBook.getBooks());
		
		System.out.println(" Java Book is ::"+semBook.getJavabook().getMyJavaBook());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		EmployeeDetails emp = (EmployeeDetails) context.getBean("empDetails");
		System.out.println(" Employee Details :: \n");
		System.out.println(emp.getName()+"\n");
		System.out.println(emp.getDep()+"\n");
		System.out.println(emp.getEmpSal().getSalary()+"\n");
		
	/*	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Libary mylib = (Libary) appc.getBean("mylib");
		
		System.out.println("Books are:-"+mylib.getBooks().toString());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		SolarSystem solsys =(SolarSystem) appc.getBean("solarSys");
		
		System.out.println(" Planets::-"+solsys.getPlanets().toString());
		System.out.println(" Inner Planets::-"+solsys.getInnerPlanets().getInnerPlanetsNames());
*/
		
	}

}

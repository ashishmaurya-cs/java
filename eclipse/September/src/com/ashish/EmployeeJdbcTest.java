package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeJdbcTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springjdbcconfig.xml"); 
		EmployeeJdbcDao e=(EmployeeJdbcDao)ctx.getBean("id1");
	    //int status=	e.save(new EmployeeJdbc(11, "Ashish", 10000));
		//System.out.println(status);
		
		int status1=e.update(new EmployeeJdbc(11, "Ajeet", 12000));
		System.out.println(status1);
		
		//int status2=e.delete(11);
		//System.out.println(status2);
	}
}

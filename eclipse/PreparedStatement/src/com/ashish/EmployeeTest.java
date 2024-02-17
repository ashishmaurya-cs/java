package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeDao e= (EmployeeDao)ctx.getBean("id1");
		boolean status=e.saveEmployee(new Employee(101,"Prabhat",12000));
		System.out.println(status);
	}
}

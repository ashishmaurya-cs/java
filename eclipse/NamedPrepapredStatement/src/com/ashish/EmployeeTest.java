package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao e=(EmployeeDao)ctx.getBean("id1");
		boolean status=e.save(new Employee(10, "Sandeep", 8000));
		System.out.println(status);
	}
}

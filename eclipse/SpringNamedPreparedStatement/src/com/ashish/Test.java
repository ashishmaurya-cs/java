package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		boolean status=dao.saveEmployee(new Employee(12, "Abhay", 13000));
		System.out.println(status);
	}

}

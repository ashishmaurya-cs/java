package com.ashish;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	EmployeeDao e=(EmployeeDao)ctx.getBean("edao");
	List<Employee> list=e.getAllEmployee();
	
	for(Employee ee:list){
		System.out.println(ee);
	}
}
}

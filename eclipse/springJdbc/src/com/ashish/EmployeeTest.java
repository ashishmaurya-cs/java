package com.ashish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	 public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		int status=dao.saveEmployee(new Employee(11, "Ashish", 10000));
		System.out.println(status);
		
		int status1=dao.updateEmployee(new Employee(11, "Ajeet", 20000));
		System.out.println(status1);
		
		Employee e=new Employee();
		e.setId(11);
		int status2=dao.deleteEmployee(e);
		System.out.println(status2);
		
	}
}

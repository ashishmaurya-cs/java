package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeTest {
	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("employeeconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("id2");
		Employee e=(Employee)o;
		e.display();*/
	Employee e=(Employee)new XmlBeanFactory(new ClassPathResource("employeeconfig.xml")).getBean("id2");
	e.display();
	}
}

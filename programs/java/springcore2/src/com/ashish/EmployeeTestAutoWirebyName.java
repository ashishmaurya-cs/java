package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class EmployeeTestAutoWirebyName {
//example of autowire byName
	public static void main(String[] args) {
		Resource res =new ClassPathResource("employeeconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Employee e=(Employee)factory.getBean("id1");
		e.display();

	}
}

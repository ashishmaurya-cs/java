package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentMain {
	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("studentconfig.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		Object o=factory.getBean("id1");
		StudentPojo s=(StudentPojo)o;*/
		StudentPojo s=(StudentPojo) new XmlBeanFactory(new ClassPathResource("studentconfig.xml")).getBean("id1");
		s.display();
		
	}

}

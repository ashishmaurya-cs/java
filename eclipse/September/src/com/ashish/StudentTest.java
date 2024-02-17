package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentTest {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("studentconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("id1");
		Student s=(Student)o;
		s.display();
	}

}

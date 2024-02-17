package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentObjectTest {
	public static void main(String[] args) {
		Resource res= new ClassPathResource("studentobjectconfi.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		StudentObject s= (StudentObject)factory.getBean("id2");
		s.display();
	}
	
}

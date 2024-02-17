package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student1Main {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("student1config.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("st");
		Student1 s=(Student1)o;
		System.out.println(s.getRoll()+" "+s.getName());
	}

}

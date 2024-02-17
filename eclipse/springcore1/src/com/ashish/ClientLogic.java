package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public static void main(String[] args) {
		Resource res1=new ClassPathResource("clientconfig1.xml");
		Resource res2=new ClassPathResource("clientconfig2.xml");
		
		BeanFactory factory1=new XmlBeanFactory(res1);
		BeanFactory factory2=new XmlBeanFactory(res2, factory1);
		
		Object o1 =factory2.getBean("id3");
		Object o2 =factory2.getBean("id4");
		
		Journey j1=(Journey)o1;
		Journey j2=(Journey)o2;
		j1.startJourney();
		System.out.println();
		j2.startJourney();

	}

}

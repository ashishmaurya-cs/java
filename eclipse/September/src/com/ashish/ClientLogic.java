package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {
	public static void main(String[] args) {
		Resource res1=new ClassPathResource("clientconfig.xml");
		BeanFactory factory1=new XmlBeanFactory(res1);
	Resource res2=new ClassPathResource("clientconfig1.xml");
	BeanFactory factory2=new XmlBeanFactory(res2, factory1);
	
	Journey j1 =(Journey) factory2.getBean("id3");
	Journey j2=(Journey) factory2.getBean("id4");
	j1.startJourney();
	j2.startJourney();
	}
}

package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class QuestionSetTest {
public static void main(String[] args) {
	Resource res= new ClassPathResource("questionsetconfi.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	QuestionSet s=(QuestionSet) factory.getBean("id1");
	s.display();
}
}

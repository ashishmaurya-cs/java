package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class QuestionSetObjectTest {
	public static void main(String[] args) {
		QuestionSetObject q=(QuestionSetObject)new XmlBeanFactory(new ClassPathResource("questionsetobjectconf.xml")).getBean("id3");
		q.display();
	}
}

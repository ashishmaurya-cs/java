package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class QuestionMapTest {
	public static void main(String[] args) {
		QuestionMap q=(QuestionMap) new XmlBeanFactory(new ClassPathResource("questionmapconfig.xml")).getBean("id1");
		q.display();
	}
}

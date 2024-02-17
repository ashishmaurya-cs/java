package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class QuestionListTest {
	public static void main(String[] args) {
		QuestionList q=(QuestionList)new XmlBeanFactory(new ClassPathResource("questionlistconfig.xml")).getBean("id1");
		q.display();
	}
}

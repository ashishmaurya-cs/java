package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class QuestionSetTest {

	public static void main(String[] args) {
		QuestionSet q=(QuestionSet) new XmlBeanFactory(new ClassPathResource("questionsetconfig.xml")).getBean("id1");
		q.display();

	}

}

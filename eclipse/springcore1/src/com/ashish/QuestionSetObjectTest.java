package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class QuestionSetObjectTest {

	public static void main(String[] args) {
		QuestionSetObject q= (QuestionSetObject) new XmlBeanFactory(new ClassPathResource("questionsetobjectconfig.xml")).getBean("id3");
		q.display();

	}

}

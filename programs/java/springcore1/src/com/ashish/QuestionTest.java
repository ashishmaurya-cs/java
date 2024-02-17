package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class QuestionTest {

	public static void main(String[] args) {
	Question q=(Question) new XmlBeanFactory(new ClassPathResource("questionconfig.xml")).getBean("id1");
		q.display();
	}

}

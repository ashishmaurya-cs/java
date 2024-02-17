package com.ashish;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class QuestionListObjectTest {

	public static void main(String[] args) {
		QuestionListObject q=(QuestionListObject) new XmlBeanFactory(new ClassPathResource("questionlistobjectconfig.xml")).getBean("id3");
		q.display();
	}

}

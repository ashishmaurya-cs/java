package com.ashish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMapObjectTest {
	public static void main(String[] args) {
		QuestionMapObject q=(QuestionMapObject)new ClassPathXmlApplicationContext("questionmapObjectconfig.xml").getBean("question");
		q.display();
	}

}

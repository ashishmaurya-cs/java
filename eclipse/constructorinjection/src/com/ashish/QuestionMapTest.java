package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMapTest {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("questionmapconfi.xml");
		QuestionMap sa=(QuestionMap) ctx.getBean("id1");
		sa.display();
	}
}

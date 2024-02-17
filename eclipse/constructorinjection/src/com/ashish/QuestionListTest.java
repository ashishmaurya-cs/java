package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionListTest {
public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("questionlistconfi.xml");
	QuestionList q= (QuestionList)ctx.getBean("id2");
	q.display();
}
}

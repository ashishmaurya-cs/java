package com.ashish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Questiontest {
	public static void main(String[] args) {
		Question q=(Question) new ClassPathXmlApplicationContext("config.xml").getBean("id1");
		q.display();
		
	}

}

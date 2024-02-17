package com.ashish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	public static void main(String[] args) {
		User u=(User) new ClassPathXmlApplicationContext("config.xml").getBean("id5");
		u.display();
	}
}

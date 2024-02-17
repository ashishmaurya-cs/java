package com.ashish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserTest {
public static void main(String[] args) {
	Resource res = new ClassPathResource("questionmapobjectconf.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	Object o= factory.getBean("id5");
	User u= (User)o;
	u.display();
}
}

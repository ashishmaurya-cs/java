package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainFile {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class, new Integer(1));
		Product p=(Product)o;
		System.out.println(p.getProductId()+" "+p.getProName()+" "+p.getPrice());
		session.close();
		factory.close();

	}

}

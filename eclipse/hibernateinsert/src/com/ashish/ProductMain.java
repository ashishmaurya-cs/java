package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Product p=new Product();
		p.setProductId(2);
		p.setProName("Cooler");
		p.setPrice(7000);
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		
		
		System.out.println("Saved successfully.");
		tx.commit();
		session.close();
		factory.close();
		

	}

}

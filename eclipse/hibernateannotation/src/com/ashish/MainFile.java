package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class MainFile {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Product p =new Product();
		p.setId(1);
		p.setProduct("Mobile");
		p.setPrice(10000);
		
		Product p1 =new Product();
		p1.setId(2);
		p1.setProduct("Cooler");
		p1.setPrice(10000);
		
		Transaction tr=session.beginTransaction();
		session.persist(p);
		session.persist(p1);
		tr.commit();
		session.close();
		factory.close();
		
	}
}

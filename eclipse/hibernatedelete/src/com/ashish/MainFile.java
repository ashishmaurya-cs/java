package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainFile {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		Product p= new Product();
		p.setProductId(1);
		
		Transaction tr=session.beginTransaction();
		session.delete(p);
		tr.commit();
		session.close();
		factory.close();
	}

}

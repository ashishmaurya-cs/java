package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Employee e=new Employee();
		e.setName("Ashish");
		e.setSalary(12000);
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
		session.close();
		factory.close();
	}

}

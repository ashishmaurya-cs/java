package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainFile {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		Employee e = new Employee();
		e.setId(1);
		e.setName("Ashish");
		//we did't  set value of salary and it should be null in databases
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
		factory.close();
		session.close();

	}

}

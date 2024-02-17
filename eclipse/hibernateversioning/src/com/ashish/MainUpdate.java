package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainUpdate {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Employee.class,new Integer(1));
		Employee s=(Employee)o;

		Transaction tx = session.beginTransaction();	

		 s.setSalary(6000); 

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		
		
	}

}

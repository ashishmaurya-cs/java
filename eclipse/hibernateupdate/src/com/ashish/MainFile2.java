package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainFile2 {
		 public static void main(String[] args) {
			Configuration cfg =  new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session =factory.openSession();
			Product p = new Product();
			p.setProductId(1);
			p.setProName("Fan");
			p.setPrice(5000);
			Transaction tr =session.beginTransaction();
			session.update(p);
			tr.commit();
			session.close();
			factory.close();
			
		}
}

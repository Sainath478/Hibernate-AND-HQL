package com.Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insertdata_Members {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Members.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Members m = new Members();
		m.setName("om phadtare");
		m.setEmail("oma@6162");
		m.setMembership_date(2009);
		
		ss.persist(m);
		tr.commit();
	}

}

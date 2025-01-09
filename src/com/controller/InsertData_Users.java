package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Users;

public class InsertData_Users {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Users.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Users u = new Users();
		
		u.setName("akash devaibone");
		u.setEmail("aku@gmail.com");
		u.setPassword("aku@123");
		
		ss.persist(u);
		tr.commit();
		System.out.println("value inserted sucessfully...");
		
	}

}

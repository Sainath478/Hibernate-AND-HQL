package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Books;

public class InsertData_Books {

	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Books b = new Books();
		
		b.setBook_name("The Catcher in the Rye");
		b.setBook_author(" J.D. Salinger");
		b.setBook_price(379);
		
		ss.persist(b);
		tr.commit();
		
		System.out.println("value inserted sucesssfully...");

	}

}

package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Books;

public class DeleteData_Books {

	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction te  = ss.beginTransaction();
		
		Books b = new Books();
		int book_price = 238;
		
		Books b1 = ss.get(Books.class, book_price);
		ss.remove(b1);
		
		te.commit();
		
		System.out.println("Value deleted sucessfully...");
	}
}

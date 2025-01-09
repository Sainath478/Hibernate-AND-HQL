package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Books;

public class UpdateData_Books {
	
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Books b = new Books();
		
		int book_price = 299;
		
		 Books b1 = ss.get(Books.class, book_price);
		 b1.setBook_name("I don't know");
		 
		 ss.update(b1);
		 
		 tr.commit();
		 
		 System.out.println("Value updated sucessfully...");
	}

}

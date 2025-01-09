package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Books;

public class Create_Table_Books {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Books.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Books b = new Books();
		System.out.println("Table created sucessfully..!");
	}

}

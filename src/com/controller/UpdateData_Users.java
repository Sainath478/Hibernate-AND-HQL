package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Users;

public class UpdateData_Users {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Users.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Users u = new Users();

		int user_id = 2;
		Users u1 = ss.get(Users.class, user_id);
		u1.setPassword("deepu@2610");

		ss.merge(u1);

		tr.commit();

	}

}

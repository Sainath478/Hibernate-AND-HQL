package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Employee;

public class Emp_DeleteData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		int emp_id = 2;
		Employee ee = ss.get(Employee.class, emp_id);
		System.out.println(ee);
//		ss.delete(ee);
//		tr.commit();
//		System.out.println("delete sucessfully...");
	}

}

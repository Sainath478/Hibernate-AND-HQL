package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Employee;

public class Emp_Update {

	public static void main(String[] args) {

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Employee emp = new Employee();
		int emp_id = 3;
		Employee e = ss.get(Employee.class, emp_id);
		e.setEmp_name("deepak waghmare");

		ss.merge(e);
		tr.commit();
		System.out.println("value updated...");

	}

}

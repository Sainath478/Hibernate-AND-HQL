package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Employee;

public class Employee_Create_Table {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Employee emp = new Employee();

		System.out.println("Table created sucessfully....!");

	}

}

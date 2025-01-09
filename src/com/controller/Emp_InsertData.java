package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Employee;

public class Emp_InsertData {

	public static void main(String[] args) {

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Employee emp = new Employee();

		emp.setEmp_id(4);
		emp.setEmp_address("pune");
		emp.setEmp_name("shubham gaikwad");
		emp.setEmp_department("fullstack devloper");
		emp.setSalary(30000);

		ss.persist(emp);
		tr.commit();

		System.out.println("value inserted sucessfully...");
	}

}

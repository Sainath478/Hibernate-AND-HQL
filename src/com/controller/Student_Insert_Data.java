package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Student;

public class Student_Insert_Data {

	public static void main(String[] args) {
     
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Student str = new Student();
		
//		str.setStudent_roll_no(45);
		str.setStudent_address("Bijalinagar");
		str.setStudent_city("India");
		str.setStudent_name("Shivam Jha");
        System.out.println("Value inserted sucessfully...");
        
		ss.persist(str);
		
		tr.commit();
		
	}

}

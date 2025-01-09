package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Student;

public class Student_Update_Record {

	public static void main(String[] args) {
    
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Student s = new Student();
		int Student_roll_no = 4;
		Student s1 = ss.get(Student.class,Student_roll_no);
		s1.setStudent_address("Balajinagar");
		
		ss.merge(s1);
		tr.commit();
		System.out.println("Updated sucessfully...!");
	}

}

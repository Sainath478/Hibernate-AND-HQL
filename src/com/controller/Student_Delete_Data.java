package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Student;

public class Student_Delete_Data {

	public static void main(String[] args) {

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Student stu = new Student();
		
		int Student_roll_no = 1;
		
		Student str = ss.get(Student.class, Student_roll_no);
		ss.remove(str);
		tr.commit();
		ss.close();
		
//		System.out.println(str);
		
	}

}

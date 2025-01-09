package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.Student;

public class Student_Create {

	public static void main(String[] args) {

     Configuration cc = new Configuration();
     cc.configure("hibernate.cfg.xml");
     cc.addAnnotatedClass(Student.class);
     
     SessionFactory sf = cc.buildSessionFactory();
     Session ss = sf.openSession();
     Transaction tr = ss.beginTransaction();
     
     Student stu = new Student();
     System.out.println(stu);
     System.out.println("create sucessfully...");
     
//     ss.persist(stu);
//     
//     tr.commit();
      
	}

}

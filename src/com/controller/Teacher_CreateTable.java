package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.TeacherData;

public class Teacher_CreateTable {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(TeacherData.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		TeacherData tt = new TeacherData();
		System.out.println("created sucessfully....!");
	}

}

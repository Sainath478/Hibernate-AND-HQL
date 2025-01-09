package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Class.TeacherData;

public class Teacher_InsertData {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(TeacherData.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr  = ss.beginTransaction();
		
		TeacherData t = new TeacherData();
		t.setTeacher_name("salunkhe sir");
		t.setTeacher_salary(100000);
		t.setTeacher_address("satara");
		ss.persist(t);
		tr.commit();
	}

}

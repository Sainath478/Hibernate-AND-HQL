package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.Class.Student;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord_Student {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);
		
		SessionFactory ss = cc.buildSessionFactory();
		Session sf = ss.openSession();
		
		Transaction tr = sf.beginTransaction();
		
	HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
	CriteriaQuery<Object> cq = hcb.createQuery();
	Root<Student> root = cq.from(Student.class);
	cq.select(root);
	
	List<Object> list = sf.createQuery(cq).getResultList();
	 
	for (Object object : list) 
	{
		System.out.println(object);
		
	}
	tr.commit();
	
	}

}

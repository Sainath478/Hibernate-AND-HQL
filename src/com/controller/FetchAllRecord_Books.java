package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.Class.Books;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord_Books {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Books.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction te  = ss.beginTransaction();
		
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Books> root = cq.from(Books.class);
		cq.select(root);

	
		List<Object> results = ss.createQuery(cq).getResultList();

		
		for (Object result : results) {
		    Books books = (Books) result; 
		    System.out.println(result); 
		}

		te.commit();

	}

}

package com.Class;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData_Members {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Members.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		HibernateCriteriaBuilder hb =  ss.getCriteriaBuilder();
		CriteriaQuery<Object> cr =  hb.createQuery();
		Root<Members> root =  cr.from(Members.class);
		cr.select(root);
		
		List<Object> list =  ss.createQuery(cr).getResultList();
		
		for(Object data : list)
		{
			System.out.println(data);
		}
		tr.commit();
	}

}

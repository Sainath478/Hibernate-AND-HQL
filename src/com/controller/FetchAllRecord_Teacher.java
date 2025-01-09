package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.Class.TeacherData;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord_Teacher {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(TeacherData.class);
		
		SessionFactory sf = cc.buildSessionFactory();
	    Session ss = sf.openSession();
	    
	    Transaction tr = ss.beginTransaction();
	    
	   HibernateCriteriaBuilder hb =  ss.getCriteriaBuilder();
	  CriteriaQuery<Object> cr =  hb.createQuery();
	  Root<TeacherData> root =  cr.from(TeacherData.class);
	  cr.select(root);
	  
	 List<Object> list = ss.createQuery(cr).getResultList();
	  
	  for (Object data : list) {
		  System.out.println(data);
		
	}
	}

}

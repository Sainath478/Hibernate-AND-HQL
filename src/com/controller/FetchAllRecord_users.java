package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.Class.Users;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord_users {

	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Users.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cr = hb.createQuery();
		Root<Users> root = cr.from(Users.class);
		cr.select(root);

		List<Object> list = ss.createQuery(cr).getResultList();
		for (Object result : list) {
			System.out.println(result);
		}
		tr.commit();
	}

}

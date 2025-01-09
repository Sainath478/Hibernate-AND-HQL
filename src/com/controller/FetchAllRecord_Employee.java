package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.Class.Employee;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord_Employee {
	public static void main(String[] args) {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		CriteriaQuery<Object> cr = hcb.createQuery();
		Root<Employee> root = cr.from(Employee.class);
		cr.select(root);

		List<Object> list = ss.createQuery(cr).getResultList();

		for (Object fetchAll : list) {
			System.out.println(fetchAll);

		}
		tr.commit();
	}

}

package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class EmployeeDao {

	public static void CreateTableEmp() {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		System.out.println("table created sucesfully...");

	}

	public static void InsertDataEmp() {
		Scanner sc = new Scanner(System.in);

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = null;
		Session ss = null;
		Transaction tr = null;

		try {
			sf = cc.buildSessionFactory();
			ss = sf.openSession();

			System.out.print("How many values are you inserting in the Employee table: ");
			int value = sc.nextInt();

			tr = ss.beginTransaction();

			for (int i = 1; i <= value; i++) {
				System.out.print("Enter emp_name: ");
				String name = sc.nextLine();

				System.out.print("Enter emp_address: ");
				String address = sc.nextLine();

				System.out.print("Enter emp_domain: ");
				String domain = sc.nextLine();

				System.out.print("Enter emp_salary: ");
				int salary = sc.nextInt();
				sc.nextLine();

				Employee e = new Employee();
				e.setEmp_name(name);
				e.setAddress(address);
				e.setDomain(domain);
				e.setSalary(salary);

				ss.persist(e);
			}

			tr.commit();
			System.out.println("Values inserted successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void UpdateDataEmp() throws Exception {
		Scanner sc = new Scanner(System.in);

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		System.out.print("Which id are you updating data : ");
		int id = sc.nextInt();

		System.out.println("1)update emp_name?");
		System.out.println("2)update emp_address?");
		System.out.println("3)update emp_domain?");
		System.out.println("4)update emp_salary?");

		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();

		Employee e = ss.get(Employee.class, id);

		switch (choice) {
		case 1: {
			System.out.print("Enter updated name : ");
			String upname = sc.nextLine();
			e.setEmp_name(upname);
			break;
		}
		case 2: {
			System.out.print("Enter updated address : ");
			String upaddress = sc.nextLine();
			e.setAddress(upaddress);
			break;
		}

		case 3: {
			System.out.print("Enter updated domain : ");
			String updomain = sc.nextLine();
			e.setDomain(updomain);
			break;
		}

		case 4: {
			System.out.print("Enter updated salary : ");
			int upsalary = sc.nextInt();
			e.setSalary(upsalary);
			break;
		}
		default:
			System.out.println("Invalid option....!");
			break;
		}
		ss.merge(e);

		tr.commit();
		ss.close();
		System.out.println("Value updated sucessfully...");

	}

	public static void DeleteDataEmp() {
		Scanner sc = new Scanner(System.in);
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Employee.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		System.out.print("Which data are you deleting : ");
		int id = sc.nextInt();

		Employee e = ss.get(Employee.class, id);
		ss.remove(e);

		tr.commit();
		ss.close();
		System.out.println("Value deleted sucessfully...");

	}

}

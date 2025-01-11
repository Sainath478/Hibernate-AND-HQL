package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StudentDao {

	public static void createTableStu() {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		tr.commit();
		ss.close();
		System.out.println("Table created sucessfully...");
	}

	public static void InserDataStu() throws Exception {
		Scanner sc = new Scanner(System.in);
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		try {
			System.out.print("How many times are you inserting values into the student table: ");
			int value = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= value; i++) {
				System.out.println("Enter stu_name: ");
				String stu_name = sc.nextLine();

				System.out.println("Enter stu_address: ");
				String stu_address = sc.nextLine();

				System.out.println("Enter stu_country: ");
				String stu_country = sc.nextLine();

				System.out.println("Enter stu_state: ");
				String stu_state = sc.nextLine();

				Student s = new Student();
				s.setStu_name(stu_name);
				s.setStu_address(stu_address);
				s.setStu_country(stu_country);
				s.setStu_state(stu_state);

				ss.persist(s);
			}

			tr.commit();
			System.out.println("Values inserted successfully...");
		} catch (Exception e) {
			e.getMessage();

		}

	}

	public static void UpdateDataStu() throws Exception {
		Scanner sc = new Scanner(System.in);

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		try {
			System.out.println("1) Update stu_name?");
			System.out.println("2) Update stu_address?");
			System.out.println("3) Update stu_country?");
			System.out.println("4) Update stu_state?");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			System.out.print("Which stud_id are you updating: ");
			int id = sc.nextInt();
			sc.nextLine();

			Student s = ss.get(Student.class, id);
//			if (s == null) {
//				System.out.println("Student with ID " + id + " not found.");
//				return;
//			}

			switch (choice) {
			case 1: {
				System.out.print("Enter the updated name: ");
				String upname = sc.nextLine();
				s.setStu_name(upname);
				break;
			}

			case 2: {
				System.out.print("Enter the updated address: ");
				String upaddress = sc.nextLine();
				s.setStu_address(upaddress);
				break;
			}

			case 3: {
				System.out.print("Enter the updated country: ");
				String upcountry = sc.nextLine();
				s.setStu_country(upcountry);
				break;
			}

			case 4: {
				System.out.print("Enter the updated state: ");
				String upstate = sc.nextLine();
				s.setStu_state(upstate);
				break;
			}

			default:
				System.out.println("Invalid choice...");
				return;
			}

			ss.merge(s); 
			tr.commit();
			System.out.println("Updated successfully...");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void DeleteDataStu() {
		Scanner sc = new Scanner(System.in);

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Student.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		System.out.print("Which id are you deleting : ");
		int id = sc.nextInt();

		Student s = ss.get(Student.class, id);

		ss.remove(s);
		tr.commit();
		ss.close();

		System.out.println("value deleted sucessfully...");
	}

}

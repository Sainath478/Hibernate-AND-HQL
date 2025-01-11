package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Project;

public class Projectdao {

	public static void CreateTablePrp() {
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Project.class);

		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Project p = new Project();
		System.out.println("Table created sucessfully...");
	}

	public static void InsertDataPro() {
		Scanner sc = new Scanner(System.in);

		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Project.class);

		SessionFactory sf = null;
		Session ss = null;
		Transaction tr = null;

		try {
			cc.buildSessionFactory();
			sf.openSession();

			System.out.print("How many value are you inserting in Project table : ");
			int id = sc.nextInt();

			ss.beginTransaction();

			Project p = ss.get(Project.class, id);

			for (int i = 1; i <= id; i++) {
				System.out.print("Enter project_id :");
				String project_id = sc.nextLine();

				System.out.print("Enter project_name :");
				String project_name = sc.nextLine();

				System.out.print("Enter project_manager :");
				String project_manager = sc.nextLine();

				System.out.print("Enter start_date :");
				String start_date = sc.nextLine();

				System.out.print("Enter end_date :");
				String end_date = sc.nextLine();

				p.setProject_id(id);
				p.setProject_name(project_name);
				p.setProject_manager(project_manager);
				p.setStart_date(start_date);
				p.setEnd_date(end_date);

				ss.persist(p);
			}
			tr.commit();
			System.out.println("value inserted sucessfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdateDataPro() {
		Scanner sc = new Scanner(System.in);
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Project.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		System.out.print("Which data are you updating :  ");
		int id = sc.nextInt();
		
		System.out.println("1)update project_id?");
		System.out.println("2)update project_name?");
		System.out.println("3)update project_manager?");
		System.out.println("4)update start_date?");
		System.out.println("5)update end_date?");
		System.out.println();
		
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();
		
		Project p =  ss.get(Project.class, id);
		
		switch(choice)
		{
		case 1 : 
		{
			System.out.print("Enter update project_id : ");
			int project_id = sc.nextInt();
			p.setProject_id(project_id);
			break;
			
		}
		
		case 2 : 
		{
			System.out.print("Enter update project_name : ");
			String project_name = sc.nextLine();
			p.setProject_name(project_name);
			break;
			
		}
		

		case 3 : 
		{
			System.out.print("Enter update project_manager : ");
			String project_manager = sc.nextLine();
			p.setProject_manager(project_manager);
			break;
			
		}
		
		case 4 : 
		{
			System.out.print("Enter update start_date : ");
			String start_date = sc.nextLine();
			p.setStart_date(start_date);
			break;
			
		}
		
		case 5 : 
		{
			System.out.print("Enter update end_date : ");
			String end_date = sc.nextLine();
			p.setEnd_date(end_date);
			break;
			
		}
		
		default : System.out.println("Invalid choice...");break;
		
		
		
		}
		ss.persist(p);
		tr.commit();
		System.out.println("value updated sucessfully...");
		
	}
	
	public static void DeleteDataPro() {
		Scanner sc = new Scanner(System.in);
		
		Configuration cc = new Configuration();
		cc.configure("hibernate.cfg.xml");
		cc.addAnnotatedClass(Project.class);
		
		SessionFactory sf = cc.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		System.out.print("Which project_id are you deleting : ");
		int id  = sc.nextInt();
		
		Project p = ss.get(Project.class, id);
		
		ss.delete(p);
		tr.commit();
		sc.close();
		
		System.out.println("value deleted sucessfully...");
		
	}
	

		
		
	}
	



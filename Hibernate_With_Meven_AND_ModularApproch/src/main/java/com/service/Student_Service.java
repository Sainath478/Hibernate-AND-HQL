package com.service;

import com.dao.StudentDao;

public class Student_Service {

	public static void createTableStu() {
		StudentDao sd = new StudentDao();
		sd.createTableStu();
	}

	public static void InsertDataStu() throws Exception {
		StudentDao sd1 = new StudentDao();
		sd1.InserDataStu();
	}

	public static void UpdateDataStu() throws Exception {
		StudentDao sd2 = new StudentDao();
		sd2.UpdateDataStu();
	}

	public static void DeleteDataStu() {
		StudentDao sd3 = new StudentDao();
		sd3.DeleteDataStu();
	}

}

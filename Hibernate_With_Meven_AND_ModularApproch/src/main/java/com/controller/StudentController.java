package com.controller;

import com.service.Student_Service;

public class StudentController {

	public static void main(String[] args) throws Exception {
		
		Student_Service ss = new Student_Service(); 
//		ss.createTableStu();
//		ss.InsertDataStu();
//		ss.UpdateDataStu();
		ss.DeleteDataStu();

	}

}

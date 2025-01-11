package com.controller;

import com.service.Employee_Service;

public class Employee_Controller {

	public static void main(String[] args) throws Exception {
		Employee_Service es = new Employee_Service();
//		es.CreateTableEmp();
//		es.InsertDataEmp();
//		es.DeleteDataEmp();
        es.UpdateDataEmp();
	}

}

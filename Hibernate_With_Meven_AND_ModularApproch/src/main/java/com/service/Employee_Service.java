package com.service;

import com.dao.EmployeeDao;

public class Employee_Service {

	public void CreateTableEmp() {
		EmployeeDao ed1 = new EmployeeDao();
		ed1.CreateTableEmp();
	}

	public void InsertDataEmp() throws Exception {
		EmployeeDao ed2 = new EmployeeDao();
		ed2.InsertDataEmp();
	}

	public void UpdateDataEmp() throws Exception {
		EmployeeDao ed3 = new EmployeeDao();
		ed3.UpdateDataEmp();
	}

	public void DeleteDataEmp() {
		EmployeeDao ed4 = new EmployeeDao();
		ed4.DeleteDataEmp();
	}

}

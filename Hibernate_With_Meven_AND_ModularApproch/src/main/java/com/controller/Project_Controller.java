package com.controller;

import com.service.Project_Service;

public class Project_Controller {
	public static void main(String[] args) {
		Project_Service pd = new Project_Service();
		pd.CreateTablePro();
	}

}

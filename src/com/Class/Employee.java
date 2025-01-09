package com.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	private String emp_name;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String emp_department;
	private String emp_address;
	private int salary;

	public Employee() {
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_department=" + emp_department
				+ ", emp_address=" + emp_address + ", salary=" + salary + "]";
	}

	public Employee(String emp_name, int emp_id, String emp_department, String emp_address, int salary) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_department = emp_department;
		this.emp_address = emp_address;
		this.salary = salary;
	}

}

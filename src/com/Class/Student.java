package com.Class;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Studentdata")
public class Student {
	
	private String Student_name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Student_roll_no;
	private String Student_address;
	@Column(name = "country")
	private String Student_city;
	
	public Student() {
	}

	public Student(String student_name, int student_roll_no, String student_address, String student_city) {
		super();
		Student_name = student_name;
		Student_roll_no = student_roll_no;
		Student_address = student_address;
		Student_city = student_city;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public int getStudent_roll_no() {
		return Student_roll_no;
	}

	public void setStudent_roll_no(int student_roll_no) {
		Student_roll_no = student_roll_no;
	}

	public String getStudent_address() {
		return Student_address;
	}

	public void setStudent_address(String student_address) {
		Student_address = student_address;
	}

	public String getStudent_city() {
		return Student_city;
	}

	public void setStudent_city(String student_city) {
		Student_city = student_city;
	}

	@Override
	public String toString() {
		return "Student [Student_name=" + Student_name + ", Student_roll_no=" + Student_roll_no + ", Student_address="
				+ Student_address + ", Student_city=" + Student_city + "]";
	}
	
	
	
	
	

}

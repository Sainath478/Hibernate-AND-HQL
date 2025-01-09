package com.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeacherData {
	
	private String teacher_name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacher_id;
	private int teacher_salary;
	private String teacher_address;
	
	public TeacherData() {

	}

	@Override
	public String toString() {
		return "TeacherData [teacher_name=" + teacher_name + ", teacher_id=" + teacher_id + ", teacher_salary="
				+ teacher_salary + ", teacher_address=" + teacher_address + "]";
	}

	public TeacherData(String teacher_name, int teacher_id, int teacher_salary, String teacher_address) {
		super();
		this.teacher_name = teacher_name;
		this.teacher_id = teacher_id;
		this.teacher_salary = teacher_salary;
		this.teacher_address = teacher_address;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public int getTeacher_salary() {
		return teacher_salary;
	}

	public void setTeacher_salary(int teacher_salary) {
		this.teacher_salary = teacher_salary;
	}

	public String getTeacher_address() {
		return teacher_address;
	}

	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}
	

}

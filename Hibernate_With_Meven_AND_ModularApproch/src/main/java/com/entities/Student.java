package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stu_id;
	private String stu_name;
	private String stu_address;
	private String stu_country;
	private String stu_state;
	
	public Student() {
	}

	public Student(int stu_id, String stu_name, String stu_address, String stu_country, String stu_state) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_address = stu_address;
		this.stu_country = stu_country;
		this.stu_state = stu_state;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_address() {
		return stu_address;
	}

	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}

	public String getStu_country() {
		return stu_country;
	}

	public void setStu_country(String stu_country) {
		this.stu_country = stu_country;
	}

	public String getStu_state() {
		return stu_state;
	}

	public void setStu_state(String stu_state) {
		this.stu_state = stu_state;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_address=" + stu_address
				+ ", stu_country=" + stu_country + ", stu_state=" + stu_state + "]";
	}
	
	
	

}

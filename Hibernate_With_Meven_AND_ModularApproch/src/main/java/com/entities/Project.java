package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
	@Id
	private int project_id;
	private String project_name;
	private String project_manager;
	private String start_date;
	private String end_date;
	
	public Project() {
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", project_manager="
				+ project_manager + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_manager() {
		return project_manager;
	}

	public void setProject_manager(String project_manager) {
		this.project_manager = project_manager;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public Project(int project_id, String project_name, String project_manager, String start_date, String end_date) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_manager = project_manager;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	

}

package com.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Members {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id ;
	private String name;
	private String email;
	private int membership_date; 
	
	public Members() {
	}

	public Members(int member_id, String name, String email, int membership_date) {
		super();
		this.member_id = member_id;
		this.name = name;
		this.email = email;
		this.membership_date = membership_date;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMembership_date() {
		return membership_date;
	}

	public void setMembership_date(int membership_date) {
		this.membership_date = membership_date;
	}

	@Override
	public String toString() {
		return "Members [member_id=" + member_id + ", name=" + name + ", email=" + email + ", membership_date="
				+ membership_date + "]";
	}
	

}

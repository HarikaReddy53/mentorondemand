package com.mentor.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(max = 128)
	@Column(name="username")
	private String userName;
	
	@Column(name="linked_in_url")
	private String linkedinUrl;
	
	
	
	@Column(name="years_of_experience")
	private String yearsOfExperience;
	
	
	@Column(name="reg_date_time")
	private String regDateTime;
	
	@Column(name="reg_code")
	private String regCode;
	
	@Column(name="active")
	private boolean active;

	
	public Mentor() {
		super();
		
	}

public Mentor(String userName, String linkedinUrl, String yearsOfExperience, String regDateTime,
			String regCode, boolean active) {
		super();
		this.userName = userName;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.regDateTime = regDateTime;
		this.regCode = regCode;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(String regDateTime) {
		this.regDateTime = regDateTime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

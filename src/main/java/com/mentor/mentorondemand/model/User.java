package com.mentor.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    @NotNull
	@Email
    @Size(max = 65)
	@Column(name="username")
	private String userName;
	
    @NotNull
    @Size(max = 128)
	@Column(name="password")
	private String password;
    
    @NotNull
    @Size(max = 128)
	@Column(name="first_name")
	private String firstName;
	
    
    @Size(max = 128)
    @Column(name="last_name")
	private String lastName;
	
    
    @Size(max = 128)
    @Column(name="contact_number")
	private Long contactNumber;
	
	
    @Column(name="reg_date_time")
	private String regDateTime;
	
	@Column(name="reg_code")
	private String regCode;
	
	@Column(name="active")
	private boolean active;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password, String firstName, String lastName, @Size(max = 128) Long contactNumber,
			String regDateTime, String regCode, boolean active) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regDateTime = regDateTime;
		this.regCode = regCode;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", regDateTime=" + regDateTime
				+ ", regCode=" + regCode + ", active=" + active + "]";
	}
}

package com.mentor.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="mentor_id")
	private int mentorId;
	
	@Column(name="start_time")
	private String startTime;
	
	
	
	@Column(name="end_time")
	private String endTime;
	
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;
	
	
	public MentorCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public MentorCalendar(int mentorId, String startTime, String endTime, String startDate, String endDate) {
		super();
		this.mentorId = mentorId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMentorId() {
		return mentorId;
	}


	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}

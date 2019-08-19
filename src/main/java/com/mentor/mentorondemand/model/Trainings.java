package com.mentor.mentorondemand.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Trainings")
public class Trainings {
                @Id
                @GeneratedValue(strategy=GenerationType.AUTO)
                private int id;
                @Column(name = "status")
                private String status;
                @Column(name = "progress")
                private String progress;
                @Column(name = "rating")
                private int rating;
                @Column(name = "amount_received")
                private double amountReceived;
                @Column(name = "start_date")
                private Date startDate;
                @Column(name = "end_date")
                private Date endDate;
                @Column(name = "start_time")
                private String startTime;
                @Column(name = "end_time")
                private String endTime;
                @OneToOne(fetch=FetchType.LAZY)
                @JoinColumn(name="mentor_id",insertable=false,updatable=false)
                private Mentor mentor;
                @OneToOne(fetch=FetchType.LAZY)
                @JoinColumn(name="skill_id",insertable=false,updatable=false)
                private MentorSkills skills;
                @OneToOne(fetch=FetchType.LAZY)
                @JoinColumn(name="user_id",insertable=false,updatable=false)
                private User user;
                public Trainings() {
                                super();
                }
                public Trainings(int id, String status, String progress, int rating, double amountReceived, Date startDate,
                                                Date endDate, String startTime, String endTime, Mentor mentor, MentorSkills skills, User user) {
                                super();
                                this.id = id;
                                this.status = status;
                                this.progress = progress;
                                this.rating = rating;
                                this.amountReceived = amountReceived;
                                this.startDate = startDate;
                                this.endDate = endDate;
                                this.startTime = startTime;
                                this.endTime = endTime;
                                this.mentor = mentor;
                                this.skills = skills;
                                this.user = user;
                }
                public int getId() {
                                return id;
                }
                public void setId(int id) {
                                this.id = id;
                }
                public String getStatus() {
                                return status;
                }
                public void setStatus(String status) {
                                this.status = status;
                }
                public String getProgress() {
                                return progress;
                }
                public void setProgress(String progress) {
                                this.progress = progress;
                }
                public int getRating() {
                                return rating;
                }
                public void setRating(int rating) {
                                this.rating = rating;
                }
                public double getAmountReceived() {
                                return amountReceived;
                }
                public void setAmountReceived(double amountReceived) {
                                this.amountReceived = amountReceived;
                }
                public Date getStartDate() {
                                return startDate;
                }
                public void setStartDate(Date startDate) {
                                this.startDate = startDate;
                }
                public Date getEndDate() {
                                return endDate;
                }
                public void setEndDate(Date endDate) {
                                this.endDate = endDate;
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
                public Mentor getMentor() {
                                return mentor;
                }
                public void setMentor(Mentor mentor) {
                                this.mentor = mentor;
                }
                public MentorSkills getSkills() {
                                return skills;
                }
                public void setSkills(MentorSkills skills) {
                                this.skills = skills;
                }
                public User getUser() {
                                return user;
                }
                public void setUser(User user) {
                                this.user = user;
                }
                @Override
                public String toString() {
                                return "Trainings [id=" + id + ", status=" + status + ", progress=" + progress + ", rating=" + rating
                                                                + ", amountReceived=" + amountReceived + ", startDate=" + startDate + ", endDate=" + endDate
                                                                + ", startTime=" + startTime + ", endTime=" + endTime + ", mentor=" + mentor + ", skills=" + skills
                                                                + ", user=" + user + "]";
                }
                
}


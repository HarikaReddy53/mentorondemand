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
@Table(name="technologies")
public class Technologies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
	 @NotNull
	 @Size(max = 128)
	@Column(name = "name")
	private String name;

	@Column(name = "toc")
	private String toc;

	@Column(name = "duration")
	private String duration;

	@Column(name = "pre_requites")
	private String preRequites;

	public Technologies(String name, String toc, String duration, String preRequites) {
		super();
		this.name = name;
		this.toc = toc;
		this.duration = duration;
		this.preRequites = preRequites;
	}

	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPreRequites() {
		return preRequites;
	}

	public void setPreRequites(String preRequites) {
		this.preRequites = preRequites;
	}

}

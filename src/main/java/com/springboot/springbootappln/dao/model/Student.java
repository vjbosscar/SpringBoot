package com.springboot.springbootappln.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int stdid;
	private String stuName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "collegeid")
	private College college;

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdid, String stuName, College college) {
		super();
		this.stdid = stdid;
		this.stuName = stuName;
		this.college = college;
	}
	
	

}

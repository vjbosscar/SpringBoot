package com.springboot.springbootappln.dao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue
	private int collegeid;
	private String collegename;
	
	@OneToMany(targetEntity = Student.class, mappedBy = "college")
	private List<Student> students;
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public College(int collegeid, String collegename, List<Student> students) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
		this.students = students;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

}

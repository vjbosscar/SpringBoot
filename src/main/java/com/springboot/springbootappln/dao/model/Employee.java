package com.springboot.springbootappln.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	private String ename;
	
	private int sal;
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "cid")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Company company;
	
	
	public long getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String ename, int sal, int age) {
		super();
		this.ename = ename;
		this.sal = sal;
		this.age = age;
	}


	public Employee(String ename, int sal, int age, Company company) {
		super();
		this.ename = ename;
		this.sal = sal;
		this.age = age;
		this.company = company;
	}

	
	
}

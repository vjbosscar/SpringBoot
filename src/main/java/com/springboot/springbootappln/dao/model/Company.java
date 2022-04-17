package com.springboot.springbootappln.dao.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Company {
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	
	@OneToMany(targetEntity = Employee.class, mappedBy = "company", cascade = CascadeType.ALL)
	private List<Employee> employee;
	
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String cname) {
		super();
		this.cname = cname;
	}
	public Company(String cname, List<Employee> employee) {
		super();
		this.cname = cname;
		this.employee = employee;
	}
	public Company(int cid, String cname, List<Employee> employee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.employee = employee;
	}
	

	
	
}

package com.springboot.springbootappln.dao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int cid;
	
	private String cname;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company", cascade = CascadeType.ALL)
	private List<Employee> employee;
	

	public long getCid() {
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
	}
	public Company(int cid, String cname, List<Employee> employee) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	

	
	
}

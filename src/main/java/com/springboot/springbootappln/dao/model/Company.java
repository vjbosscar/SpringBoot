package com.springboot.springbootappln.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	
	@OneToMany(mappedBy = "company",cascade = CascadeType.REMOVE)
    private List<Employee> employees = new ArrayList<>();
	
	@CreationTimestamp
	private Date created_timestamp;
	
	@UpdateTimestamp
	private Date updated_timestamp;
	
	
	
	
	public Date getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(Date created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public Date getUpdated_timestamp() {
		return updated_timestamp;
	}
	public void setUpdated_timestamp(Date updated_timestamp) {
		this.updated_timestamp = updated_timestamp;
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
	}
	public Company(int cid, String cname, List<Employee> employee) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	

	
	
}

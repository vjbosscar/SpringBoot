package com.springboot.springbootappln.dao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {
	
	@Id
	@GeneratedValue
	private int delegateid;
	private String delegatename;
	
	@ManyToMany
	@JoinTable(name = "JOIN_EVENT_DELEGATE",
	joinColumns = {@JoinColumn(name = "delegateid")},
	inverseJoinColumns = {@JoinColumn(name = "eventid")})
	private List<Event> event;

	public int getDelegateid() {
		return delegateid;
	}

	public void setDelegateid(int delegateid) {
		this.delegateid = delegateid;
	}

	public String getDelegatename() {
		return delegatename;
	}

	public void setDelegatename(String delegatename) {
		this.delegatename = delegatename;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	public Delegate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delegate(int delegateid, String delegatename, List<Event> event) {
		super();
		this.delegateid = delegateid;
		this.delegatename = delegatename;
		this.event = event;
	}

}

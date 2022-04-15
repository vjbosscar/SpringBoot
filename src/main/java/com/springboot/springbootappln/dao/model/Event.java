package com.springboot.springbootappln.dao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private int eventid;
	private String eventname;
	@ManyToMany
	@JoinTable(name = "JOIN_EVENT_DELEGATE",
	joinColumns = {@JoinColumn(name = "eventid")},
	inverseJoinColumns = {@JoinColumn(name = "delegateid")})
	private List<Delegate> delegate;
	public Event(int eventid, String eventname, List<Delegate> delegate) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.delegate = delegate;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public List<Delegate> getDelegate() {
		return delegate;
	}
	public void setDelegate(List<Delegate> delegate) {
		this.delegate = delegate;
	}

}

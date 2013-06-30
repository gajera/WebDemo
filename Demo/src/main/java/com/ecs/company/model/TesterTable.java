package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tester_table")
public class TesterTable {
	
	@Id
	@Column(name="WWID")
	private int wwid;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PROGRAMNAME")
	private String programname;
	
	@Column(name="STATUSDEF")
	private String statusdef;
	
	@Column(name="TYPEDEFN")
	private String typedefn;
	
	@Column(name="INTELSITE")
	private String intelsite;
	
	public int getWwid() {
		return wwid;
	}
	public void setWwid(int wwid) {
		this.wwid = wwid;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramname() {
		return programname;
	}
	public void setProgramname(String programname) {
		this.programname = programname;
	}
	public String getStatusdef() {
		return statusdef;
	}
	public void setStatusdef(String statusdef) {
		this.statusdef = statusdef;
	}
	public String getTypedefn() {
		return typedefn;
	}
	public void setTypedefn(String typedefn) {
		this.typedefn = typedefn;
	}
	public String getIntelsite() {
		return intelsite;
	}
	public void setIntelsite(String intelsite) {
		this.intelsite = intelsite;
	}

}

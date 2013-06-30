package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TESTERS")
public class Tester {

	
	@Id
	@Column(name="WWID")
	private int wwid;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="MIDDLEINITIAL")
	private String middleinitial;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="GROUPNAME")
	private String groupname;
	
	@Column(name="SUPERGROUPNAME")
	private String supergroupname;
	
	@Column(name="MAILSTOP")
	private String mailstop;
	
	
	

	@Column(name="TESTERTYPE")
	private int testertype;
	
	@Column(name="CELLPHONESTATUS")
	private int cellphonestatus;
	
	@Column(name="TABLETSTATUS")
	private int tabletstatus;
	
	@Column(name="SEGMENTID")
	private int segmentid;
	
	@Column(name="INTELSITE")
	private String intelsite;
	
	
	@Column(name="OPTINSTATUS")
	private char optinstatus;

	public int getWwid() {
		return wwid;
	}

	public void setWwid(int wwid) {
		this.wwid = wwid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddleinitial() {
		return middleinitial;
	}

	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getSupergroupname() {
		return supergroupname;
	}

	public void setSupergroupname(String supergroupname) {
		this.supergroupname = supergroupname;
	}

	public String getMailstop() {
		return mailstop;
	}

	public void setMailstop(String mailstop) {
		this.mailstop = mailstop;
	}

	
	


	


	public String getIntelsite() {
		return intelsite;
	}

	public void setIntelsite(String intelsite) {
		this.intelsite = intelsite;
	}


	

	
	public int getTestertype() {
		return testertype;
	}

	public void setTestertype(int testertype) {
		this.testertype = testertype;
	}

	public int getCellphonestatus() {
		return cellphonestatus;
	}

	public void setCellphonestatus(int cellphonestatus) {
		this.cellphonestatus = cellphonestatus;
	}

	public int getTabletstatus() {
		return tabletstatus;
	}

	public void setTabletstatus(int tabletstatus) {
		this.tabletstatus = tabletstatus;
	}

	public int getSegmentid() {
		return segmentid;
	}

	public void setSegmentid(int segmentid) {
		this.segmentid = segmentid;
	}

	public char getOptinstatus() {
		return optinstatus;
	}

	public void setOptinstatus(char optinstatus) {
		this.optinstatus = optinstatus;
	}

	

	
	
}

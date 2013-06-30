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
	
	@Column(name="COUNTRYID")
	private String countryid;
	
	
	@Column(name="CAMPUSCODE")
	private String campuscode;
	
	@Column(name="OFFICEPHONE")
	private String officephone;
	
	@Column(name="HOMEPHONE")
	private String homephone;
	
	@Column(name="CELLPHONE")
	private String cellphone;
	
	@Column(name="TESTERTYPE")
	private String testerype;
	
	@Column(name="CELLPHONESTATUS")
	private String cellphonestatus;
	
	@Column(name="TABLETSTATUS")
	private String tabletstatus;
	
	@Column(name="SEGMENTID")
	private String segmentid;
	
	@Column(name="INTELSITE")
	private String intelsite;
	
	@Column(name="JOINDATE")
	private String joindate;
	
	@Column(name="OPTINSTATUS")
	private String optinstatus;

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

	public String getCountryid() {
		return countryid;
	}

	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}

	public String getCampuscode() {
		return campuscode;
	}

	public void setCampuscode(String campuscode) {
		this.campuscode = campuscode;
	}

	public String getOfficephone() {
		return officephone;
	}

	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getTesterype() {
		return testerype;
	}

	public void setTesterype(String testerype) {
		this.testerype = testerype;
	}

	public String getCellphonestatus() {
		return cellphonestatus;
	}

	public void setCellphonestatus(String cellphonestatus) {
		this.cellphonestatus = cellphonestatus;
	}

	public String getTabletstatus() {
		return tabletstatus;
	}

	public void setTabletstatus(String tabletstatus) {
		this.tabletstatus = tabletstatus;
	}

	public String getSegmentid() {
		return segmentid;
	}

	public void setSegmentid(String segmentid) {
		this.segmentid = segmentid;
	}

	public String getIntelsite() {
		return intelsite;
	}

	public void setIntelsite(String intelsite) {
		this.intelsite = intelsite;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getOptinstatus() {
		return optinstatus;
	}

	public void setOptinstatus(String optinstatus) {
		this.optinstatus = optinstatus;
	}
	
}

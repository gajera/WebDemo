package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEF_PROGRAM")
public class Program {

	
	@Id
	@Column(name="PROGRAMID")
	@GeneratedValue
	private int programid;
	
	public int getProgramid() {
		return programid;
	}

	public void setProgramid(int programid) {
		this.programid = programid;
	}

	@Column(name="PROGRAMNAME")
	private String programname;
	
	@Column(name="STARTDATE")
	private String startdate;
	
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	@Column(name="EndDate")
	private String EndDate;
	
	@Column(name="ContactWWID")
	private String ContactWWID;
	
	@Column(name="Action")
	private String Action;
	
	@Column(name="DeviceTypeID")
	private int DeviceTypeID;
	
	@Column(name="SWVersion")
	private String SWVersion;
	
	@Column(name="SharePointLink")
	private String SharePointLink;
	


	public String getProgramname() {
		return programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}


	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getContactWWID() {
		return ContactWWID;
	}

	public void setContactWWID(String contactWWID) {
		ContactWWID = contactWWID;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public int getDeviceTypeID() {
		return DeviceTypeID;
	}

	public void setDeviceTypeID(int deviceTypeID) {
		DeviceTypeID = deviceTypeID;
	}

	public String getSWVersion() {
		return SWVersion;
	}

	public void setSWVersion(String sWVersion) {
		SWVersion = sWVersion;
	}

	public String getSharePointLink() {
		return SharePointLink;
	}

	public void setSharePointLink(String sharePointLink) {
		SharePointLink = sharePointLink;
	}

	
	
	
	
	
	
	
	
	
	
	
}

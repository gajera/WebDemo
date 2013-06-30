package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEF_PROGRAM")
public class Tester {

	
	@Id
	@Column(name="ProgramID")
	@GeneratedValue
	private int ProgramID;
	
	@Column(name="ProgramName")
	private String ProgramName;
	
	public int getProgramID() {
		System.out.println("PROGRAMID:-");
		return ProgramID;
	}

	public void setProgramID(int programID) {
		ProgramID = programID;
	}

	public String getProgramName() {
		System.out.println("PROGRAMNAME:-"+ProgramName);
		return ProgramName;
	}

	public void setProgramName(String programName) {
		System.out.println("PROGRAMNAME:-"+ProgramName);
		ProgramName = programName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
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

	@Column(name="StartDate")
	private String StartDate;
	
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
	
	
	
	
	
	
	
	
	
	
}

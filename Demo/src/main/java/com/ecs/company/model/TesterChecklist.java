package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tester_checklist")
public class TesterChecklist {
	
	@Id
	@Column(name="WWID")
	private int wwid;
	
	@Column(name="PROGRAMID")
	private int programid;
	
	@Column(name="SCWWID")
	private int scwwid;

	public int getWwid() {
		return wwid;
	}

	public void setWwid(int wwid) {
		this.wwid = wwid;
	}

	public int getProgramid() {
		return programid;
	}

	public void setProgramid(int programid) {
		this.programid = programid;
	}

	public int getScwwid() {
		return scwwid;
	}

	public void setScwwid(int scwwid) {
		this.scwwid = scwwid;
	}

}

package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="def_testerstatus")
public class TesterStatus {

	@Id
	@Column(name="STATUSID")
	@GeneratedValue
	private int statusid;
	
	@Column(name="STATUSDEF")
	private String statusdef;

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public String getStatusdef() {
		return statusdef;
	}

	public void setStatusdef(String statusdef) {
		this.statusdef = statusdef;
	}

	
}

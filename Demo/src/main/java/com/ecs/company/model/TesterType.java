package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="def_testertype")
public class TesterType {

	
	@Id
	@Column(name="TYPEID")
	@GeneratedValue
	private int typeid;
	
	
	@Column(name="TYPEDEFN")
	private String typedefn;


	public int getTypeid() {
		return typeid;
	}


	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}


	public String getTypedefn() {
		return typedefn;
	}


	public void setTypedefn(String typedefn) {
		this.typedefn = typedefn;
	}
}

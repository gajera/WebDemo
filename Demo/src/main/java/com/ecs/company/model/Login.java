package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class Login {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="EMAILID")
	private String EmailId;
	
	@Column(name="PASSWORD")
	private String Password;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		
		this.id = id;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		System.out.println("EMAIL"+emailId);
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		System.out.println("Password"+password);
		Password = password;
	}

}

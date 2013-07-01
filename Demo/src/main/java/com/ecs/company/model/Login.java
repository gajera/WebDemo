package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINS")
public class Login {
	
	@Id
	@Column(name="EMAILID")
	private String EmailId;
	
	@Column(name="PASSWORD")
	private String Password;
	
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
		System.out.println("PASSWORD"+password);
		Password = password;
	}

}

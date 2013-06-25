package com.ecs.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTS")
public class Contact {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="FIRSTNAME")
	private String firstname;

	@Column(name="LASTNAME")
	private String lastname;

	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	
	public String getEmail() {
		System.out.println("In GETTER EMAIL");
		return email;
	}
	public String getTelephone() {
		System.out.println("In GETTER TELEPHONE");
		return telephone;
	}
	public void setEmail(String email) {
		System.out.println("In SETTER EMAIL");
		this.email = email;
	}
	public void setTelephone(String telephone) {
		System.out.println("In SETTER TELEPHONE");
		this.telephone = telephone;
	}
	public String getFirstname() {
		System.out.println("In GETTER FNAME");
		return firstname;
	}
	public String getLastname() {
		System.out.println("In GETTER LAST NAME");
		return lastname;
	}
	public void setFirstname(String firstname) {
		System.out.println("In SETTER FNAME");
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		System.out.println("In SETTER LASTNAME");
		this.lastname = lastname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}

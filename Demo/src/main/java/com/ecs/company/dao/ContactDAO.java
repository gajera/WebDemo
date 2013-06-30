package com.ecs.company.dao;

import java.util.List;

import com.ecs.company.model.Contact;



public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}

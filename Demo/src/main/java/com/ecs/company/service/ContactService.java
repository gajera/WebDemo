package com.ecs.company.service;

import java.util.List;


import com.ecs.company.model.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}

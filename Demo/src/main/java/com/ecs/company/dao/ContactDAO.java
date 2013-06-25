package com.ecs.company.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.model.Contact;


@Transactional
public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}

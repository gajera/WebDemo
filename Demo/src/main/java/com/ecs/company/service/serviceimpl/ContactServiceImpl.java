package com.ecs.company.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.ContactDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.service.ContactService;


@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDAO contactDAO;
	
	
	public void addContact(Contact contact) {
		System.out.println("IN ADD CONTACT SERVICE");
		contactDAO.addContact(contact);
	}

	
	public List<Contact> listContact() {

		return contactDAO.listContact();
	}

	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}

package com.ecs.company.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.ContactDAO;
import com.ecs.company.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public void addContact(Contact contact) {
		System.out.println("IN ADD CONTACT DAO");
		sessionFactory.getCurrentSession().save(contact);
	}

	@Override
	public List<Contact> listContact() {

		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	@Override
	public void removeContact(Integer id) {
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}

	}
}

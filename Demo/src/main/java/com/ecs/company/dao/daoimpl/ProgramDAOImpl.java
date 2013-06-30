package com.ecs.company.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecs.company.dao.ProgramDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.Program;

@Repository
public class ProgramDAOImpl implements ProgramDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addContact(Program program) {
		System.out.println("IN ADD CONTACT DAO");
		sessionFactory.getCurrentSession().save(program);
		
	}

	@Override
	public List<Program> listContact() {
		System.out.println("IN LIST CONTACT DAO");
		return sessionFactory.getCurrentSession().createQuery("from Program").list();
	}

	@Override
	public void removeContact(Integer ProgramId) {
		Program program = (Program) sessionFactory.getCurrentSession().load(
				Program.class, ProgramId);
		if (null != program) {
			sessionFactory.getCurrentSession().delete(program);
		}

		
	}

}

package com.ecs.company.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecs.company.dao.TesterStatusDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.TesterStatus;

@Repository
public class TesterStatusDAOImpl implements TesterStatusDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addTesterStatus(TesterStatus testerstatus) {
		System.out.println("IN ADD CONTACT DAO");
		sessionFactory.getCurrentSession().save(testerstatus);
		
	}

	@Override
	public List<TesterStatus> listTesterStatus() {
		return sessionFactory.getCurrentSession().createQuery("from TesterStatus").list();
	}

	@Override
	public void removeTesterStatus(Integer TesterStatusId) {
		TesterStatus testerstatus = (TesterStatus) sessionFactory.getCurrentSession().load(
				TesterStatus.class, TesterStatusId);
		if (null != testerstatus) {
			sessionFactory.getCurrentSession().delete(testerstatus);
		}
		
	}

}

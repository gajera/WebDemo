package com.ecs.company.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecs.company.dao.TesterDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.Tester;


@Repository
public class TesterDAOImpl implements TesterDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addTesterStatus(Tester tester) {
		sessionFactory.getCurrentSession().save(tester);
		
	}

	@Override
	public List<Tester> listTester() {
		return sessionFactory.getCurrentSession().createQuery("from Tester").list();
	}

	@Override
	public List<Tester> listTesterLocation() {
		return sessionFactory.getCurrentSession().createQuery("select distinct intelsite from Tester order by intelsite").list();
	}

	@Override
	public void removeTesterStatus(Integer WWID) {
		Tester tester = (Tester) sessionFactory.getCurrentSession().load(
				Tester.class, WWID);
		if (null != tester) {
			sessionFactory.getCurrentSession().delete(tester);
		}

		
	}

}

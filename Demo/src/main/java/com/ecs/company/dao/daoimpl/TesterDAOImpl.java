package com.ecs.company.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecs.company.dao.TesterDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.TesterTable;
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
	public List<TesterTable> listTester() {
		/*return sessionFactory.getCurrentSession().createQuery("" +
				//"SELECT t.wwid,t.firstname,t.lastname,t.email,t.intelsite " +
				"FROM Tester t, TesterStatus ts,TesterType tt" +
				//" where Tester.wwid=tc.wwid " +
				" where t.cellphonestatus=ts.statusid " +
				//" and tc.programid=p.programid " +
				" and t.testertype=tt.typeid").list();
				//"").list();*/
		
		return sessionFactory.getCurrentSession().createQuery("from TesterTable").list();
	}

	@Override
	public List<Tester> listTesterLocation() {
		return sessionFactory.getCurrentSession().createQuery("select distinct intelsite from Tester order by intelsite").list();
	}

	@Override
	public List<Tester> listTesterSC() {
		return sessionFactory.getCurrentSession().createQuery("from Tester where testertype in (2,4) order by lastname").list();
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

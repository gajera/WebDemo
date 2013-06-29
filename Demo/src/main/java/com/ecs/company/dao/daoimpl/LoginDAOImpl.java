package com.ecs.company.dao.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.LoginDAO;
import com.ecs.company.model.Login;

@Repository
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	//Session session=new Session();
	

	@Override
	public String validateLogin(Login login) {
		System.out.println("IN DOAIMPL "+login.getEmailId()+" "+login.getPassword());
		/*Criteria crit = session.createCriteria(Login.class);
		crit.setProjection(Projections.rowCount());
		crit.add( Restrictions.eq(login.getEmailId(), true));
		crit.add( Restrictions.eq(login.getPassword(), true));
		System.out.println(crit.uniqueResult());*/
		//return (String) crit.uniqueResult(); 
		//System.out.println(session.createQuery("select count(*) from Login where emailid='"+login.getEmailId()+"' and password='"+login.getPassword()+"'").uniqueResult());
		//sessionFactory.getCurrentSession().createQuery("from Login where emailid='"+login.getEmailId()+"' and password='"+login.getPassword()+"'").uniqueResult();
		//System.out.println(session.createCriteria("Login").setProjection(Projections.rowCount()).uniqueResult());
		//return (String) session.createQuery("from Login where emailid='"+login.getEmailId()+"' and password='"+login.getPassword()+"'").uniqueResult();
		List<String> demo =new ArrayList<String>();
		Long output=(Long) sessionFactory.getCurrentSession().createQuery("select count(*) from Login where emailid='"+login.getEmailId()+"' and password='"+login.getPassword()+"'").iterate().next();
		System.out.println(output.toString());
		return  output.toString();
	}

	

}

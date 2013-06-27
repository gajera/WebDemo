package com.ecs.company.dao.daoimpl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.LoginDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String validateLogin(Login login) {
		return sessionFactory.getCurrentSession().createQuery("from Contact where username="+login.getEmailId()+" and password="+login.getPassword()).toString();
		
		
	}

	
	

}

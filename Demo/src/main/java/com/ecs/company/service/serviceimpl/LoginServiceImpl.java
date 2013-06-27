package com.ecs.company.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.ContactDAO;
import com.ecs.company.dao.LoginDAO;
import com.ecs.company.model.Login;
import com.ecs.company.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO logindao;
	
	
	@Override
	public String validateLogin(Login login) {
		System.out.println("LOGIN");
		logindao.validateLogin(login);
		return null;
	}
	

}

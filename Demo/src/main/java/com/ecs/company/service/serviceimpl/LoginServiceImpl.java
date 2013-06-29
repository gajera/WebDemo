package com.ecs.company.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.ContactDAO;
import com.ecs.company.dao.LoginDAO;
import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;
import com.ecs.company.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO logindao;
	
	
	@Transactional
	public String validateLogin(Login login) {
		
		logindao.validateLogin(login);
		return null;
	}
	
	

}

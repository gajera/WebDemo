package com.ecs.company.service;

import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;

@Transactional
public interface LoginService {
	
	public String validateLogin(Login login);

}

package com.ecs.company.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;


public interface LoginService {
	
	
	public String validateLogin(Login login);
	

}

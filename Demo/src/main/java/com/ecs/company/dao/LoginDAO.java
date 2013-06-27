package com.ecs.company.dao;

import java.util.List;

import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;

public interface LoginDAO {
	
	public String validateLogin(Login login);

}

package com.ecs.company.dao;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;
import com.ecs.company.model.Login;

public interface LoginDAO {
	
	public String validateLogin(Login login);
	

}

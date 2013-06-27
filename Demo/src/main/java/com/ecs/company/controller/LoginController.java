package com.ecs.company.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.company.model.Contact;
import com.ecs.company.model.Login;
import com.ecs.company.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@ModelAttribute("Login")
	public Login createLogin() {
		System.out.println("In Login");
		return new Login();
	}
	
	@RequestMapping(value = "/login")
    public String validateLogin(@ModelAttribute("login")
	Login login, BindingResult result) {
 
		System.out.println("In 2nd MEthod");
		loginservice.validateLogin(login);
 
        return "login";
    }

}

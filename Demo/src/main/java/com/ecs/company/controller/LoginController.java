package com.ecs.company.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping(value = "/index")
    public String listContacts(Map<String, Object> map) {
 
		System.out.println("In 2nd MEthod contact");
        map.put("login", new Login());
        //map.put("contactList", contactService.listContact());
 
        return "login";
    }

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("login")
	Login login, BindingResult result) {
		
		String output=null;
		System.out.println("ADD METHOD "+loginservice.validateLogin(login));
		if(loginservice.validateLogin(login).equals("1"))
		{
			System.out.println("Yes Valid User");
			output= "redirect:/tester";
		}
		else
		{
			System.out.println("InValid User");
			output= "redirect:/index";
		}
		
		return output;
		
	}
	

}

package com.ecs.company.controller;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.company.model.Contact;
import com.ecs.company.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;

	

	@RequestMapping(value = "/contact")
    public String listContacts(Map<String, Object> map) {
 
		System.out.println("In 2nd MEthod contact");
        map.put("contact", new Contact());
        map.put("contactList", contactService.listContact());
 
        return "contact";
    }

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
	Contact contact, BindingResult result) {

		System.out.println("ADD MOTHOD");
		contactService.addContact(contact);

		return "redirect:/contact";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId")
	Integer contactId) {

		contactService.removeContact(contactId);

		return "redirect:/contact";
	}
}

package com.ecs.company.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ecs.company.model.Contact;
import com.ecs.company.model.Program;
import com.ecs.company.model.Tester;
import com.ecs.company.service.ProgramService;
import com.ecs.company.service.TesterStatusService;

@Controller
public class TesterController {
	
	
	@Autowired
	ProgramService programservice;
	
	@Autowired
	TesterStatusService testerstatuservice;
	
	

	@RequestMapping(value = "/tester")
    public String listContacts(Map<String, Object> map) {
 
		List demo=new ArrayList();
		demo.addAll(programservice.listContact());
		for(int i=0;i<3;i++)
		{
			System.out.println(demo.get(i));
		}
		System.out.println("In 2nd MEthod contact");
		//map.put("tester", new Tester());
        map.put("programNameGet", programservice.listContact());
        map.put("testerStatusGet", testerstatuservice.listTesterStatus());
         
        return "tester";
    }

}

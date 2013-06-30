package com.ecs.company.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ecs.company.dao.ProgramDAO;
import com.ecs.company.model.Program;
import com.ecs.company.service.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService {
	
	@Autowired
	ProgramDAO programDAO;
	
	@Transactional
	public void addContact(Program program) {
		System.out.println("IN ADD CONTACT SERVICE");
		programDAO.addContact(program);
	}

	@Transactional
	public List<Program> listContact() {
		System.out.println("IN LIST PROGRAM SERVICE");
		return programDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer Programid) {
		programDAO.removeContact(Programid);
	}

}

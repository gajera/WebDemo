package com.ecs.company.service;

import java.util.List;
import com.ecs.company.model.Program;

public interface ProgramService {
	
	public void addContact(Program program);
	public List<Program> listContact();
	public void removeContact(Integer ProgramId);
	

}

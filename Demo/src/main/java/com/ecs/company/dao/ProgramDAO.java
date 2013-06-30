package com.ecs.company.dao;

import java.util.List;


import com.ecs.company.model.Program;

public interface ProgramDAO {
	
	
	public void addContact(Program Program);
	public List<Program> listContact();
	public void removeContact(Integer ProgramId);

}

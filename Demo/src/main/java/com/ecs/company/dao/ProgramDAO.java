package com.ecs.company.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.ecs.company.model.Program;

@Transactional
public interface ProgramDAO {
	
	
	public void addContact(Program Program);
	public List<Program> listContact();
	public void removeContact(Integer ProgramId);

}

package com.ecs.company.dao;

import java.util.List;

import com.ecs.company.model.Tester;

public interface TesterDAO {
	
	public void addTesterStatus(Tester tester);
	public List<Tester> listTester();
	public List<Tester> listTesterLocation();
	public void removeTesterStatus(Integer WWID);

}

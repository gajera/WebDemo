package com.ecs.company.dao;

import java.util.List;

import com.ecs.company.model.TesterTable;
import com.ecs.company.model.Tester;

public interface TesterDAO {
	
	public void addTesterStatus(Tester tester);
	public List<TesterTable> listTester();
	public List<Tester> listTesterLocation();
	public List<Tester> listTesterSC();
	public void removeTesterStatus(Integer WWID);

}

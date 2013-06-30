package com.ecs.company.dao;

import java.util.List;

import com.ecs.company.model.TesterStatus;

public interface TesterStatusDAO {

	public void addTesterStatus(TesterStatus testerstatus);
	public List<TesterStatus> listTesterStatus();
	public void removeTesterStatus(Integer TesterStatusId);
}

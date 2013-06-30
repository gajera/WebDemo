package com.ecs.company.service;

import java.util.List;

import com.ecs.company.model.TesterStatus;

public interface TesterStatusService {

	public void addTesterStatus(TesterStatus testerstatus);
	public List<TesterStatus> listTesterStatus();
	public void removeTesterStatus(Integer TesterStatusId);
}

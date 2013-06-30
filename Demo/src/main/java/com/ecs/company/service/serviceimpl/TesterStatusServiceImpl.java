package com.ecs.company.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.TesterStatusDAO;
import com.ecs.company.model.TesterStatus;
import com.ecs.company.service.TesterStatusService;

@Service
@Transactional
public class TesterStatusServiceImpl implements TesterStatusService{
	
	@Autowired
	TesterStatusDAO testerstatusDAO;

	@Override
	public void addTesterStatus(TesterStatus testerstatus) {
		testerstatusDAO.addTesterStatus(testerstatus);
		
	}

	@Override
	public List<TesterStatus> listTesterStatus() {
		
		return testerstatusDAO.listTesterStatus();
	}

	@Override
	public void removeTesterStatus(Integer TesterStatusId) {
		testerstatusDAO.removeTesterStatus(TesterStatusId);
		
	}

}

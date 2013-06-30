package com.ecs.company.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.company.dao.TesterDAO;
import com.ecs.company.model.Tester;
import com.ecs.company.service.TesterService;

@Service
@Transactional
public class TesterServiceImpl implements TesterService{

	@Autowired
	TesterDAO testerdao;
	
	@Override
	public void addTesterStatus(Tester tester) {
		testerdao.addTesterStatus(tester);
		
	}

	@Override
	public List<Tester> listTester() {
		return testerdao.listTester();
	}

	@Override
	public List<Tester> listTesterLocation() {
		return testerdao.listTesterLocation();
	}

	@Override
	public void removeTesterStatus(Integer WWID) {
		testerdao.removeTesterStatus(WWID);
		
	}

}

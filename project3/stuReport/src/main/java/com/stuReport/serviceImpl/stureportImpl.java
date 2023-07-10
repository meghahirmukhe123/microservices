package com.stuReport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuReport.entity.stureport;
import com.stuReport.repo.stureportrepo;
import com.stuReport.service.stureportservice;

@Service
public class stureportImpl implements stureportservice{

	@Autowired
	private stureportrepo Sturepo;

	@Override
	public stureport create(stureport Stureport) {
		// TODO Auto-generated method stub
		return Sturepo.save(Stureport);
	}

	@Override
	public List<stureport> getreportdata() {
		// TODO Auto-generated method stub
		return Sturepo.findAll();
	}

	@Override
	public List<stureport> getReportdataByStuId(String stuId) {
		// TODO Auto-generated method stub
		return Sturepo.findByStuId(stuId);
	}
	
	
}

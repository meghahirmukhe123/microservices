package com.stuBio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuBio.entity.stuBio;
import com.stuBio.repo.biorepo;
import com.stuBio.service.bioservice;


@Service
public class bioimpl implements bioservice {

	
	@Autowired
	private biorepo Biorepo;

	@Override
	public stuBio create(stuBio Stubio) {
		// TODO Auto-generated method stub
		return Biorepo.save(Stubio);
	}

	@Override
	public List<stuBio> getStuBio() {
		// TODO Auto-generated method stub
		return Biorepo.findAll();
	}

	@Override
	public List<stuBio> getByStuId(String stuId) {
		// TODO Auto-generated method stub
		return Biorepo.findByStuId(stuId);
	}

	@Override
	public List<stuBio> getByResultId(String resultid) {
		// TODO Auto-generated method stub
		return Biorepo.findByResultid(resultid);
	}
	
	
	

	

}

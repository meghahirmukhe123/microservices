package com.marks.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marks.entity.stumarks;
import com.marks.repo.markrepo;
import com.marks.service.markservice;


@Service
public class markImpl implements markservice {

	
	@Autowired
	
	private markrepo Markrepo;
	
	
	@Override
	public stumarks create(stumarks Stumarks) {
		String resultId=UUID.randomUUID().toString();
		Stumarks.setResultId(resultId);
		
		return Markrepo.save(Stumarks);
	}

	@Override
	public List<stumarks> getAll() {
		
		return Markrepo.findAll();
	}

	@Override
	public stumarks get(String resultId) {
		
		return Markrepo.findById(resultId).orElseThrow(null);
	}

}

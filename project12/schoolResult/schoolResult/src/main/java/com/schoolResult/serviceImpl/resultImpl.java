package com.schoolResult.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolResult.entity.schoolResult;
import com.schoolResult.repo.resultrepo;
import com.schoolResult.service.resultService;

@Service
public class resultImpl implements resultService{

	@Autowired
	private resultrepo Resultrepo;
	
	@Override
	public schoolResult createSchoolResult(schoolResult SchoolResult) {
		// TODO Auto-generated method stub
		return Resultrepo.save(SchoolResult);
	}

	@Override
	public List<schoolResult> getAllResult() {
		// TODO Auto-generated method stub
		return Resultrepo.findAll();
	}

	@Override
	public Optional<schoolResult> getByResultId(String resultId) {
		Optional<schoolResult> sr= Resultrepo.findById(resultId);
		if(sr.isEmpty())
		{
			throw new IllegalArgumentException("wrong school result id");
		}
		return sr;
	}

	@Override
	public List<schoolResult> getbystuId(String stuId) {
		List<schoolResult> sr = Resultrepo.findBystuId(stuId);
		if(sr.isEmpty())
		{
			throw new IllegalArgumentException("wrong student id");
		}
		return sr;
	}

	@Override
	public List<schoolResult> getByteacherId(String teacherId) {
		List<schoolResult> sr =  Resultrepo.findByteacherId(teacherId);
		if(sr.isEmpty())
		{
			throw new IllegalArgumentException("wrong teachergrp id");
		}
		return sr;
	}

	@Override
	public List<schoolResult> getByschoolId(String schoolId) {
		List<schoolResult> sr =Resultrepo.findByschoolId(schoolId);
		if(sr.isEmpty())
		{
			throw new IllegalArgumentException("wrong school id");
		}
		
		return sr;
	}

}

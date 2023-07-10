package com.marks.service;

import java.util.List;

import com.marks.entity.stumarks;

public interface markservice {
	
	//create
	stumarks create(stumarks Stumarks);
	
	//get all
	List<stumarks> getAll();
	
	//get by id
	stumarks get(String resultId);

}

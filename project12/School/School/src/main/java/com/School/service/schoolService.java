package com.School.service;

import java.util.List;

import com.School.entity.schoolinfo;
import com.School.exceptionHandler.schoolException;

public interface schoolService {

	//create data
	schoolinfo createInfo(schoolinfo School);
	
	//get all data
	 List<schoolinfo> getAllSchoolData();
	 
	 //get by school id
	  schoolinfo getBySchoolId(String schoolId) throws schoolException;
}

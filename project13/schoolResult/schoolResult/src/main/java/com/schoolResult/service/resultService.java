package com.schoolResult.service;

import java.util.List;
import java.util.Optional;

import com.schoolResult.entity.schoolResult;

public interface resultService {
	
	//create
	schoolResult createSchoolResult(schoolResult SchoolResult);
	
	//get all
	List<schoolResult> getAllResult();
	
	//get by result id
	Optional<schoolResult> getByResultId(String resultId);
	
	//get by student id
	List<schoolResult> getbystuId(String stuId);
	
	//get by teacherId
	List<schoolResult> getByteacherId(String teacherId);
	
	//get by schoolId
	List<schoolResult> getByschoolId(String schoolId);
	

}

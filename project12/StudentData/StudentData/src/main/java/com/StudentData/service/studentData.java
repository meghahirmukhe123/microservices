package com.StudentData.service;


import java.util.List;
import java.util.Optional;

import com.StudentData.entity.student;


public interface studentData {
	
	//create
	 student createStudentData(student Student);
	 
	 //get all
	 List<student> getAllStudentsData();
	 
	 //get by stduent id
	 Optional<student> getbyStuId(String stuId) ;
	 
	 //get by teacher id
	 List<student> getbyTeacherGrpid(String teachegrpId) ;
	 
	 //get by result id
	 List<student> getbyResultId(String resultId) ;
	 
	 //get by school id
	 List<student> getbySchoolId(String schoolId);

}

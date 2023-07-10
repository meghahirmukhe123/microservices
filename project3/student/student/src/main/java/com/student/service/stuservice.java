package com.student.service;

import java.util.List;

import com.student.entity.studentClass;

public interface stuservice {
	
	//create student
	studentClass savestudent(studentClass Studentclass);
	
	//get all students
	List<studentClass> getallstudents();
	
	//get student by stuid
	studentClass getStudentByStuId(String stuId);
	

}

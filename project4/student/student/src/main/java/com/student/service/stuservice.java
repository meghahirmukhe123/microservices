package com.student.service;

import java.util.List;

import com.student.entity.stu;

public interface stuservice {

	//create
	stu saveStu(stu Stu);
	
	//get all stu
	List<stu> getAllStudents();
	
	//get by stu id
	stu getStuByStuId(String stuId);
}
